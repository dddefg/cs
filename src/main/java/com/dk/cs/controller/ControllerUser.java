package com.dk.cs.controller;

import com.dk.cs.pojo.UserTable;
import com.dk.cs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import javax.xml.soap.SAAJMetaFactory;
import java.util.List;

/**
 * 板凳宽宽
 */
@Controller
public class ControllerUser {

    @Autowired
    UserService userService;

    @RequestMapping({"/","login"})
    public String toLogin(){
        return "login";
    }

    @GetMapping("/toIndex")
    public String index(Model model){
        List<UserTable> list = userService.list();
        model.addAttribute("UserAll",list);
        return "index";
    }

    /**
     *
     * @param user 用户信息
     * 用于登录验证
     */
    @PostMapping("/index")
    public String toIndex(UserTable user, Model model, HttpSession session){
        System.out.println(user);
        if (user.getUName()!= null || user.getUName()!=" "){
            UserTable user1 = userService.getUserByName(user.getUName());
            if (user1 != null ){
                if (user.getUPwd().equals(user1.getUPwd())){
                    model.addAttribute("msg"," ");
                    List<UserTable> list = userService.list();
                    session.setAttribute("loginUser",user1);
                    model.addAttribute("UserAll",list);
                    return "index";
                }
                model.addAttribute("msg", "密码错误");
                return "login";
            }
            model.addAttribute("msg", "账号不存在");
            return "login";
        }
        model.addAttribute("msg", "请正确输入账号");
        return "login";
    }

    /**
     *判断是否有权限增加，有就跳转增加页面
     */
    @GetMapping("/toAdd")
    public String toAdd(@RequestParam(value = "uType")int uType, Model model){
        System.out.println("权限"+uType);
        if (uType == 0){
            model.addAttribute("msg","权限不够不能增加");
            return "redirect:/toIndex";
        }
        return "addUser";
    }

    /**
     *增加用户
     */
    @PostMapping("/addUser")
    public String addUser(UserTable userTable){
    userService.addUser(userTable);
        return "redirect:/toIndex";
    }

    /**
     *判断修改权限
     */
    @GetMapping("/modify")
    public String toModify(
            @RequestParam(value = "uCode")int uCode,
            Model model,
            HttpSession session){
        UserTable userByuCode = userService.getUserByuCode(uCode);
        session.setAttribute("upUser",uCode);
        return "upUser";
    }

    //修改
    @PostMapping("/upUser")
    public String upUser(UserTable userTable,HttpSession session){
        int upUser = (int) session.getAttribute("upUser");
        userTable.setUCode(upUser);
        userService.upUser(userTable);
        return "redirect:/toIndex";
    }
//删除
    @GetMapping("/modify")
    public String delete(
            @RequestParam(value = "uCode")int uCode,
            Model model,
            HttpSession session){
        UserTable userByuCode = userService.getUserByuCode(uCode);
        //管理员不能删除
        if (userByuCode.getUType()== 1){
            return "redirect:/toIndex";
        }
//        userService.deleteUser(uCode);
        return "redirect:/toIndex";
    }

}
