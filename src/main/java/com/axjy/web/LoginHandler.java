package com.axjy.web;

import com.axjy.pojo.User;
import com.axjy.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by lenovo on 2018/3/14.
 */
@Controller
public class LoginHandler {
    @Resource
    private UserService userService;
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping("/login")
    public String login(String userCode, String userPassword, HttpSession session){
        User loginUser=userService.login(userCode,userPassword);
        if (null==loginUser){
            throw new RuntimeException("用户名或密码输入错误");
        }session.setAttribute("loginUser",loginUser);
        return "redirect:/index";

    }

    @ExceptionHandler(RuntimeException.class)
     public String handlerException(RuntimeException ex, HttpServletRequest req){
        req.setAttribute("loginErr",ex.getMessage());
        return "login";
    }
}
