package com.gahui.ghmall.appservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @description: 启动类
 * @author: liaojiaxi
 * @date: 2020/8/4
 **/
@SpringBootApplication
public class GhMallApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GhMallApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(GhMallApplication.class, args);
    }
}
