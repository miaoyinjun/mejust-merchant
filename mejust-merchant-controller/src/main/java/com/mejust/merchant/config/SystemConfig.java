package com.mejust.merchant.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

/**
 * 系统配置
 *
 * @author <a href="mailto:zhangyongfeng@sinoland666.com">张永凤</a>
 * @version 1.0.0
 * @date 2017/8/1
 */
@Configuration
public class SystemConfig {
    @Autowired
    private Environment env;




    @PostConstruct
    public void init() {

    }
}
