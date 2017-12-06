package com.glsywow.app.config;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedisPool;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RedisConfig extends CachingConfigurerSupport {

    private static final Log log = LogFactory.getLog(RedisConfig.class);

    @Value("${jedis.host}")
    private String host;
    @Value("${jedis.port}")
    private Integer port;
    @Value("${jedis.maxTotal}")
    private Integer maxTotal;
    @Value("${jedis.maxIdle}")
    private Integer maxIdle;
    @Value("${jedis.maxWaitMillis}")
    private Long maxWaitMillis;

    @Bean
    public ShardedJedisPool shardedJedisPool() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(maxTotal);
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
        List<JedisShardInfo> jedisShardInfos = new ArrayList<>();
        jedisShardInfos.add(new JedisShardInfo(host,port));
        return  new ShardedJedisPool(jedisPoolConfig, jedisShardInfos);
    }

}
