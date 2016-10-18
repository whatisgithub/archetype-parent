package com.qmcaifu.parent.controller;

import com.alibaba.fastjson.JSON;
import com.qmcaifu.common.service.MQService;
import com.qmcaifu.common.service.RedisService;
import com.qmcaifu.parent.biz.HelloBiz;
import com.qmcaifu.parent.dal.model.BaseLog;
import com.qmcaifu.parent.form.DemoUserForm;
import com.qmcaifu.parent.form.base.DataTableResultDto;
import com.qmcaifu.parent.service.BaseService;
import com.qmcaifu.parent.util.BindResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

/**
 * @author Administrator
 * @version $Id: TestServiceController.java, v 0.1 2016年3月8日 下午5:06:54 zhuqiang Exp $
 */
@Controller
@RequestMapping("/demo")
public class DemoServiceController {


	@Autowired
	private RedisService redisService;

    @Autowired
    private MQService mqService;

	private static final Logger logger = LoggerFactory.getLogger(DemoServiceController.class);
	
	@RequestMapping("/index")
	public String index(){
		return "demo/index";
	}

	@RequestMapping("/bootstrap/index")
	public String bootstrapIndex() {
		return "login/main";
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
	public DataTableResultDto<BaseLog> dtrDemo(@Valid DemoUserForm form, BindingResult result){
		if(result.hasErrors()) {
			String msg = BindResultUtils.handlerErrMsg(result);
			logger.info("验证有错误: {}", msg);
		}
		logger.info("{}", form);

		//query list
		List<BaseLog> baseLogs = baseService.queryList();
		return new DataTableResultDto<BaseLog>(baseLogs.size(), baseLogs);
    }
	
	
	public void testHttpRequest(HttpServletRequest request, HttpServletResponse response){
	}

	@RequestMapping("/redis")
    @ResponseBody
	public Object testRedis(){
	    String key = "userid:zhangsan";
        redisService.set(key, "12345");

		redisService.set("accountBal:zhagnsan", "100", 60);
	    return redisService.get(key);
    }

    @RequestMapping("/mq")
    @ResponseBody
    public Object testMQ(){
        BaseLog bl = new BaseLog();
        for(int i=0;i<10;i++){
            bl.setId(i);
            bl.setInfo("nimei");
            mqService.send("rk", JSON.toJSONString(bl));
        }
        return "";
    }
}
