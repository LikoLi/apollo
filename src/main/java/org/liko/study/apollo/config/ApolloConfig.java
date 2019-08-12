package org.liko.study.apollo.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.liko.study.apollo.bean.SampleRedisConfig;
import org.liko.study.apollo.bean.TestJavaConfigBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author liko
 * @Date 2019/8/12
 * @Version 1.0
 * @Description ApolloConfig
 */
@Configuration
@EnableApolloConfig
public class ApolloConfig {

    @Bean
    public TestJavaConfigBean javaConfigBean() {
        return new TestJavaConfigBean();
    }

    @Bean
    public SampleRedisConfig sampleRedisConfig() {
        return new SampleRedisConfig();
    }
}
