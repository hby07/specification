package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.dream.specification.mapper")
@EnableScheduling
public class SpecificationApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpecificationApplication.class, args);
    }
}
