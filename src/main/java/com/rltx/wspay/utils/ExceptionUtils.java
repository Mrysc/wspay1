package com.rltx.wspay.utils;


import com.rltx.framework.log.support.BusinessException;

/**
 *2020年7月9日11:12:29
 */
public class ExceptionUtils {
    public static void throwException(String msg) throws Exception {
        throw new BusinessException(msg);
    }

}
