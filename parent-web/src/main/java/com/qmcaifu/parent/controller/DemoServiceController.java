package com.qmcaifu.parent.controller;

import com.qmcaifu.parent.dal.model.BaseLog;
import com.qmcaifu.parent.form.DemoUserForm;
import com.qmcaifu.parent.form.base.DataTableResultDto;
import com.qmcaifu.parent.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.List;

/**
 * @author Administrator
 * @version $Id: TestServiceController.java, v 0.1 2016年3月8日 下午5:06:54 zhuqiang Exp $
 */
@Controller
@RequestMapping("/demo")
public class DemoServiceController {

	private static final Logger logger = LoggerFactory.getLogger(DemoServiceController.class);
	
	@RequestMapping("/index")
	public String index(){
		return "demo/index";
	}
	
	@Autowired
	private BaseService baseService;
	

	@RequestMapping("/service/test")
	@ResponseBody
	public Object test(){
		List<BaseLog> list = baseService.queryList();
		return list;
	}

	@RequestMapping(value = "/dtrDemo")
	@ResponseBody
	public DataTableResultDto<DemoUserForm> dtrDemo(DemoUserForm form){
		return new DataTableResultDto<DemoUserForm>(100, Collections.EMPTY_LIST);
    }
	
	
	public void testHttpRequest(HttpServletRequest request, HttpServletResponse response){
		
	}
	
}
