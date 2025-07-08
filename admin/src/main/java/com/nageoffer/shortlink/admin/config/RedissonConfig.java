package com.nageoffer.shortlink.admin.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        config.useSingleServer()
                .setAddress("rediss://sharp-bulldog-26040.upstash.io:6379")
                .setPassword("AWW4AAIjcDEwMTczMjU0MTY1ZWY0OWVjOTI0OWM4NmUxYzFiYTgyOXAxMA")
                .setSslEnableEndpointIdentification(false);
        return Redisson.create(config);
    }
}