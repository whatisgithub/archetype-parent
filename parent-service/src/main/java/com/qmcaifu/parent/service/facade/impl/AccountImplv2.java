package com.qmcaifu.parent.service.facade.impl;

import com.qmcaifu.parent.facade.AccountService;
import com.qmcaifu.parent.facade.req.Account;
import com.qmcaifu.parent.facade.resp.AccountResp;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author zhuqiang
 * @version $Id: AccountImpl.java, v 0.1 2016年2月25日 下午3:17:29 zhuqiang Exp $
 */
@Service(version="2.0")
public class AccountImplv2 implements AccountService {

	@Override
	public AccountResp deposit(Account parent) {
		
		try{
			
			//insert dal
			System.out.println("insert insert insert----");
			
			System.out.println("lock lock lock---");
			
			System.out.println("done done done");
			
		} catch (Exception e){
			
		}
		
		
		return new AccountResp();
	}

}
