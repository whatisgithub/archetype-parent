package com.qmcaifu.parent.facade.base;

import java.io.Serializable;

/**
 * @author zhuqiang
 * @version $Id: BaseResponse.java, v 0.1 2016年2月25日 下午3:14:43 zhuqiang Exp $
 */
public class BaseResponse implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String respCode = "000000";
	private String respMsg;
	public String getRespCode() {
		return respCode;
	}
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	public String getRespMsg() {
		return respMsg;
	}
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
}
