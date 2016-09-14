package com.qmcaifu.parent.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/8/11.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    public static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping()
    public String login() {
        logger.info("登录系统");
        return "login/main";
    }

    public String logout(HttpServletRequest request){
        logger.info("==={}===登出系统", "a");
        return "redirect:/login";
    }

}
