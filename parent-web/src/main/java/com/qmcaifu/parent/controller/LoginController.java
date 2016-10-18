package com.qmcaifu.parent.controller;

import com.qmcaifu.parent.dal.model.BaseLog;
import com.qmcaifu.parent.form.base.BasePageForm;
import com.qmcaifu.parent.form.base.DataTableResultDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping("/configcenter")
    public String test(){
        return "configcenter/index";
    }

    @RequestMapping("/configcenter-data")
    @ResponseBody
    public Object test2(BasePageForm form){
        List<BaseLog> datas = new ArrayList<>();
        for(int i=0;i<form.getPageSize();i++){
            BaseLog bl = new BaseLog();
            bl.setId(i);
            datas.add(bl);
        }

        return new DataTableResultDto<BaseLog>(50, datas);
    }

}
