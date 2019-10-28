package com.allen198411.test;

import com.allen198411.superstarter.boot.EnableXDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 测试启动类
 *
 * @author allen
 * @version TestApplication.java, v 0.1 2019-10-26 下午 6:27
 */
@EnableXDoc
@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}