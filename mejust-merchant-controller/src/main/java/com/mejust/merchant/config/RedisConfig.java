package com.mejust.merchant.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;


/**
 * reids 配置加载
 */
@Configuration
@EnableAutoConfiguration
@EnableCaching
public class RedisConfig {

    public static RedisTemplate<String,String> redisTemplate = null;

    @Value("${spring.redis.host}")
    private String host;
    @Value("${spring.redis.port}")
    private int port;
    //连接超时时间（毫秒）
    @Value("${spring.redis.timeout}")
    private int timeout;
    @Value("${spring.redis.password}")
    private String password;

    public static RedisTemplate<String,String> getInstance(){
        return redisTemplate;
    }


    @Bean
    public JedisConnectionFactory getConnectionFactory(){
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setHostName(host);
        factory.setPort(port);
        factory.setPassword(password);
        factory.setTimeout(timeout);
        return factory;
    }


    @Bean
    public RedisTemplate<?, ?> getRedisTemplate(){
        RedisTemplate<String,String> template = new StringRedisTemplate(getConnectionFactory());
        redisTemplate = template;
        return template;
    }
}