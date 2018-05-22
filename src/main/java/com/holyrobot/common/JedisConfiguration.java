package com.holyrobot.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author 赵乐
 * @create 2018-05-0816:00
 * @desc
 **/
@Configuration //注册到springboot容器中 相当于spring xml中beans
public class JedisConfiguration {

    @Value("${jedis.host}")
    private String host;

    @Value("${jedis.port}")
    private int port;

    @Value("${jedis.pool.timeout}")
    private int timeout;

    @Value("${jedis.pool.max-idle}")
    private int maxIdle;

    @Value("${jedis.pool.max-wait}")
    private long maxWaitMillis;

    @Value("${jedis.password}")
    private String password;

    @Bean(name ="JedisPool")
    public JedisPool redisPoolFactory() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
        JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port);
        return jedisPool;
    }


}
