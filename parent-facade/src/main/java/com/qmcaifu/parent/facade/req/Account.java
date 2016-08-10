package com.qmcaifu.parent.facade.req;

import java.io.Serializable;

/**
 * @author zhuqiang
 * @version $Id: Account.java, v 0.1 2016年2月25日 下午3:12:56 zhuqiang Exp $
 */
public class Account implements Serializable{
	private static final long serialVersionUID = 4197790451791491562L;
	
	private String parentId;
	private String money;
	public String getAccountId() {
		return parentId;
	}
	public void setAccountId(String parentId) {
		this.parentId = parentId;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	
}
