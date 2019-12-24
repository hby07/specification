package com.dream.specification;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.dream.specification.mapper")
public class SpecificationApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpecificationApplication.class, args);
    }
}
