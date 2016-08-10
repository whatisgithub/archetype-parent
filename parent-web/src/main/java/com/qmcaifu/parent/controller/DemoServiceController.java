package com.qmcaifu.parent.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qmcaifu.parent.dal.model.BaseLog;
import com.qmcaifu.parent.service.BaseService;

/**
 * @author zhuqiang
 * @version $Id: TestServiceController.java, v 0.1 2016年3月8日 下午5:06:54 zhuqiang Exp $
 */
@Controller
public class DemoServiceController {
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@Autowired
	private BaseService baseService;
	

	@RequestMapping("/service/test")
	@ResponseBody
	public Object test(){
		List<BaseLog> list = baseService.queryList();
		return list;
	}
	
	
	public void testHttpRequest(HttpServletRequest request, HttpServletResponse response){
		
	}
	
}
