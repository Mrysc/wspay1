package com.rltx.wspay.utils;

import org.junit.Test;

import java.util.UUID;


/**
 * TradeNo 生产工具类 2020年7月9日09:50:18
 */
public class TradeNoUtils {


    /**
     * 获取32位随机码
     * @return
     */
    public static String getTradeNo32() {
        return   UUID.randomUUID().toString().replaceAll("-", "");
    }
    /**
     * 获取64位随机码
     * @return
     */
    public static String getTradeNo64() {
        return   UUID.randomUUID().toString().replaceAll("-", "")+UUID.randomUUID().toString().replaceAll("-", "");
    }




}
