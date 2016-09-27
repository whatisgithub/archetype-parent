package com.qmcaifu.parent.biz.impl;

import com.qmcaifu.facade.TradeFacade;
import com.qmcaifu.facade.req.TradeReq;
import com.qmcaifu.facade.resp.TradeResp;
import com.qmcaifu.parent.biz.HelloBiz;
import com.qmcaifu.parent.dal.model.BaseLog;
import com.qmcaifu.parent.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by nihao on 2016/9/18.
 */
@Component
public class HelloBizImpl implements HelloBiz{

    public static final Logger logger = LoggerFactory.getLogger(HelloBizImpl.class);

    @Autowired
    private TradeFacade tradeFacade;

    @Autowired
    private BaseService baseService;

    @Override
    public void sayHello() {
        TradeResp resp = tradeFacade.buildOrder(new TradeReq());

        List<BaseLog> baseLogs = baseService.queryList();

        logger.info("{}", baseLogs);

        logger.info(resp.getOrderId());
    }
}
