package com.iwei.shop.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.iwei.shop")
@MapperScan("com.iwei.shop.mapper")
public class ShopWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShopWebApplication.class, args);
    }
}

