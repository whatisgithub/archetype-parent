package com.qmcaifu.parent.facade;

import com.qmcaifu.parent.facade.req.Account;
import com.qmcaifu.parent.facade.resp.AccountResp;

/**
 * @author zhuqiang
 * @version $Id: AccountService.java, v 0.1 2016年2月25日 下午3:12:14 zhuqiang Exp $
 */
public interface AccountService {
	public AccountResp deposit(Account parent);
}
