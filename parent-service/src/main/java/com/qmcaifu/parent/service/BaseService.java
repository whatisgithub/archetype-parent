package com.qmcaifu.parent.service;

import java.util.List;

import com.qmcaifu.parent.dal.model.BaseLog;

public interface BaseService {
	List<BaseLog> queryList();
	public <T> List<T> getMax(List<T> list);
}
