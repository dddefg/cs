package com.dk.cs.config;


import com.dk.cs.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 板凳宽宽
 * 定制SpringMVC的功能
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")  //拦截全部
                .excludePathPatterns("/","/loginUser/*/*","/user/*/*/*"); //放行请求
    }
}
