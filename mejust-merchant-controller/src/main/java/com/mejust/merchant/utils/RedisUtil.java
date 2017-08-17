package com.mejust.merchant.utils;

import com.alibaba.fastjson.JSON;
import com.mejust.merchant.config.RedisConfig;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * redis工具
 *
 * @author <a href="mailto:zhangyongfeng@sinoland666.com">张永凤</a>
 * @version 1.0.0
 * @date 2017/6/14
 */
public class RedisUtil {

    /**
     * 删除key
     * @param key
     */
    public static void deleteKey(String key) {
        RedisConfig.getInstance().delete(key);
    }

    /**
     * 存储redis数据
     * @param key
     * @param data
     * @param time
     */
    public static void setRedisForString(String key, String data, long time) {
        RedisConfig.getInstance().opsForValue().set(key, data, time, TimeUnit.SECONDS);
    }

    /**
     * 存储redis数据
     * @param key
     * @param data
     * @param time
     */
    public static void setRedisForObj(String key, Object data, long time) {
        setRedisForString(key, JSON.toJSONString(data), time);
    }

    /**
     * 获取redis数据
     * @param key
     * @return 字符串格式
     */
    public static String getRedisToString(String key) {
        return RedisConfig.getInstance().opsForValue().get(key);
    }

    /**
     * 获取redis数据
     * @param key
     * @param clazz
     * @return json格式
     */
    public static <T> T getRedisToObj(String key, Class<T> clazz) {
        String result = getRedisToString(key);
        if(result == null)
            return null;
        return JSON.parseObject(result, clazz);
    }

    /**
     * 获取redis数据
     * @param key
     * @param clazz
     * @return json格式
     */
    public static <T> List<T> getRedisToList(String key, Class<T> clazz) {
        String result = getRedisToString(key);
        if(result == null)
            return null;
        return JSON.parseArray(result, clazz);
    }

}
