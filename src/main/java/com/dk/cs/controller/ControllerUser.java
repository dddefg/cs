package com.dk.cs.controller;

import com.dk.cs.pojo.ShoppingCart;
import com.dk.cs.pojo.UserTable;
import com.dk.cs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * 板凳宽宽
 */
@RestController
public class ControllerUser {

    @Autowired
    UserService userService;
//登录
    @RequestMapping(value = "/loginUser/{userName}/{passWord}")
    public UserTable loginUser(@PathVariable("userName") String userName,
                                   @PathVariable("passWord") String passWord,
                                   HttpSession session
                                   ) {
        UserTable userByName = userService.getUserByName(userName);
        if (userByName == null) {  //为空用户不存在
            return null;
        } else {  //不等于为密码错误
            if (!(userByName.getPassWord().equals(passWord))) {
                return null;
            }
            session.setAttribute("loginUser", userByName);
            return userByName;
        }
    }

    //注册
    @RequestMapping(value = "/user/{userName}/{passWord}/{phone}")
    public boolean addUser(@PathVariable("userName") String userName,
                             @PathVariable("passWord") String passWord,
                             @PathVariable("phone") Integer phone){
        UserTable userTable = new UserTable(userName,passWord,userName,"",phone);
        boolean b=false;
        try {
            //如果已存在捕获异常，表示用户名已经同名了
           b = userService.addUser(userTable);
        }catch (Exception e){
            System.out.println(e);
        }
        return b;
    }

    @RequestMapping(value = "/userDelete/{userName}")
    public boolean deleteUserById(@PathVariable("userName") String userName,
                                  HttpSession session){
        //下查看登录的用户名字是否跟被删除的一样，只能删除自己
        UserTable loginUser = (UserTable) session.getAttribute("loginUser");
        if (loginUser.getUserName().equals(userName)) {
            UserTable a = new UserTable(userName, "", "", "", 0);
            boolean b = userService.deleteUser(a);
            if (b){ //注销后退出登录
                session.removeAttribute("loginUser");
            }
            return b;
        }
        return false;
    }

    //获取已登录的用户信息(自己的)
    @RequestMapping("/onLineUser")
    public UserTable getOnLineUser(HttpSession session){
        UserTable loginUser = (UserTable) session.getAttribute("loginUser");
        return loginUser;
    }






    @RequestMapping("/")
    public String index(){
        return "未登录";
    }
}
