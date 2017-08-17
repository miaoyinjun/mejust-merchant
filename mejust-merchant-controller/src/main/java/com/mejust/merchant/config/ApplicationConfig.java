package com.mejust.merchant.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mejust.log.aop.LogAoper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 通用配置
 *
 * @author <a href="mailto:zhangyongfeng@sinoland666.com">张永凤</a>
 * @version 1.0.0
 * @date 2017/7/27
 */
@Configuration
public class ApplicationConfig {

    /**
     * json时间格式化
     * @return
     */
    @Bean
    public ObjectMapper getObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        return objectMapper;
    }

    /**
     * 方法日志打印
     * @return
     */
/*
    @Bean
    public LogAoper getLogAoper() {
        LogAoper logAoper = new LogAoper();
        return logAoper;
    }
*/

}
