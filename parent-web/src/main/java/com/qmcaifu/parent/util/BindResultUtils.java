package com.qmcaifu.parent.util;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import java.util.List;

/**
 * Created by Administrator on 2016/8/11.
 */
public class BindResultUtils {

    /**
     * 获取错误信息
     * @param result
     * @return
     */
    public static String handlerErrMsg(BindingResult result) {
        StringBuffer sb = new StringBuffer();
        List<ObjectError> errors = result.getAllErrors();
        for (ObjectError error : errors) {
            sb.append(error.getDefaultMessage()).append(", ");
        }

        return sb.substring(0, sb.length()-2).toString();
    }
}
