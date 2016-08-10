/**
 * 
 */
package com.qmcaifu.parent.form.base;

import com.qmcaifu.parent.util.page.PageDto;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuqiang
 * 2016年4月20日
 */
public class DataTableResultDto<T> {
	// pageSize
	private int draw;
	// totalCount
	private int recordsTotal;
	// totalCount
	private int recordsFiltered;
	// dataobj
	private List<T> data = new ArrayList<T>();
	
	public DataTableResultDto(PageDto<T> page) {
		this(page.getTotalCount(), page.getListdata());
	}
	
	public DataTableResultDto(int recordsTotal, List<T> data) {
		super();
		this.recordsTotal = recordsTotal;
		this.recordsFiltered = recordsTotal;
		this.data = data;
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public int getRecordsTotal() {
		return recordsTotal;
	}
	public void setRecordsTotal(int recordsTotal) {
		this.recordsTotal = recordsTotal;
	}
	public int getRecordsFiltered() {
		return recordsFiltered;
	}
	public void setRecordsFiltered(int recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
}
