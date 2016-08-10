/**
 * 
 */
package com.qmcaifu.parent.util.page;

import java.util.List;

/**
 * @author zhuqiang
 * 2016年4月21日
 */
public class PageDto<T> {
	
	private int totalCount;
	
	private List<T> listdata;
	
	public PageDto(int totalCount, List<T> listdata) {
		super();
		this.totalCount = totalCount;
		this.listdata = listdata;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<T> getListdata() {
		return listdata;
	}

	public void setListdata(List<T> listdata) {
		this.listdata = listdata;
	}
}
