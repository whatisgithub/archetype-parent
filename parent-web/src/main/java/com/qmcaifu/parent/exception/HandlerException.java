package com.qmcaifu.parent.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/8/10.
 */
public class HandlerException implements HandlerExceptionResolver {

    private static final Logger logger = LoggerFactory.getLogger(HandlerExceptionResolver.class);

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        logger.error("哎呦出异常了 {}", ex);
        //TODO yourself business code insert here
        return new ModelAndView("500");
    }
}
