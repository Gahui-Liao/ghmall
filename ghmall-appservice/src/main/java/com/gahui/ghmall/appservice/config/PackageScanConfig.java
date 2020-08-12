package com.gahui.ghmall.appservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 配置扫描包路径
 * @author: liaojiaxi
 * @date: 2020/8/5
 **/
@Configuration
@ComponentScan(basePackages = {
        "com.gahui.ghmall.data.service"
})
@MapperScan(basePackages = {
        "com.gahui.ghmall.data.mapper"
})
public class PackageScanConfig {
}
