package org.liko.study.apollo.controller;

import com.alibaba.fastjson.JSON;
import org.liko.study.apollo.bean.SampleRedisConfig;
import org.liko.study.apollo.bean.TestJavaConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;

/**
 * @Author liko
 * @Date 2019/8/12
 * @Version 1.0
 * @Description ApolloController
 */
@Controller
@ResponseBody
public class ApolloController {

    @Value("${timeout}")
    private int timeout;

    @Autowired
    private TestJavaConfigBean testJavaConfigBean;

    @Autowired
    private SampleRedisConfig sampleRedisConfig;

    @PostConstruct
    public void pc() {
        System.out.println(timeout);
    }

    @RequestMapping("/timeout")
    public int getTimeout() {
        return timeout;
    }

    @RequestMapping("/config")
    public String getConfig() {
        return JSON.toJSONString(testJavaConfigBean);
    }

    @RequestMapping("/redis_config")
    public String getRedisConfig() {
        return JSON.toJSONString(sampleRedisConfig);
    }
}
