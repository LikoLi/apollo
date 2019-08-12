package org.liko.study.apollo.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author liko
 * @Date 2019/8/12
 * @Version 1.0
 * @Description SampleRedisConfig
 */
@ConfigurationProperties(prefix = "redis.cache")
@Data
public class SampleRedisConfig {

    private int expireSeconds;

    private int commandTimeout;
}
