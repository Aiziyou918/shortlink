package com.nageoffer.shortlink.admin;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.nageoffer.shortlink.admin.dao.mapper")
public class ShortLinkAdminAppliction {
    public static void main(String[] args) {
        SpringApplication.run(ShortLinkAdminAppliction.class, args);
    }
}
