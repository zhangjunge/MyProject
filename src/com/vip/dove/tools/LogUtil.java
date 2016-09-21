package com.vip.dove.tools;

import com.alibaba.fastjson.JSONObject;
import com.vip.xfd.tools.DateUtil;
import com.vip.xfd.tools.ThreeDESUtil;
import org.apache.commons.lang3.StringUtils;


/**
 * 日志工具
 * Created by fred.zhu on 15/10/15.
 */
public class LogUtil {
    public static String vipKey = "ERERIhERERERERERERERERERERMxERER";

    /**
     * 加密日志信息
     * 将原始数据JSON序列化后进行3DES加密
     *
     * @param logInfo 加密对象
     * @return 加密结果
     */
    public static String encryptLog(Object logInfo) {
        if (logInfo != null) {
            String logStr = JSONObject.toJSONString(logInfo);
            String nowDate = DateUtil.getNowDate8Len();
            return "DATE[" + nowDate + "]--" + ThreeDESUtil.encryptMode(logStr, nowDate + vipKey);
        }
        return StringUtils.EMPTY;
    }

    /**
     * 解密已经加密的日志
     *
     * @param encryptSource 加密日志数据
     * @param encryptDate   加密日期 yyyyMMdd
     * @return 解密结果
     */
    public static String decryptLog(String encryptSource, String encryptDate) {
        if (StringUtils.isNoneEmpty(encryptSource, encryptDate)) {
            return ThreeDESUtil.decryptMode(encryptSource, encryptDate + vipKey);
        }
        return StringUtils.EMPTY;
    }

}
