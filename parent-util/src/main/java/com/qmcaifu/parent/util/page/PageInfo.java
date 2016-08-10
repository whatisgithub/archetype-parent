package com.qmcaifu.parent.util.page;

/**
 * @author Administrator
 *
 */
public class PageInfo {
	private int pageNo=0;
	private int pageSize=1;
	private int totalpage=0;
	private int totalCount=0;
	private String id;
	private String where;
	private Integer startNum;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalpage() {
		return (totalCount + pageSize - 1) / pageSize;
	}
	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	/**
	 * @return the where
	 */
	public String getWhere() {
		return where;
	}
	/**
	 * @param where the where to set
	 */
	public void setWhere(String where) {
		this.where = where;
	}
	/**
	 * @return the startNum
	 */
	public Integer getStartNum() {
		return (pageNo - 1) * pageSize;
	}
	/**
	 * @param startNum the startNum to set
	 */
	public void setStartNum(Integer startNum) {
		this.startNum = startNum;
	}
	
}
