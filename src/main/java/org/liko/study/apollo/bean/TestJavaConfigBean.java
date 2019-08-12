package org.liko.study.apollo.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Author liko
 * @Date 2019/8/12
 * @Version 1.0
 * @Description TestJavaConfigBean
 */
@Data
public class TestJavaConfigBean {

    @Value("${timeout:100}")
    private int timeout;

    @Value("${liko:liko}")
    private String liko;

}
