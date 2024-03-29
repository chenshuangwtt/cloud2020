package com.example.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.example.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
