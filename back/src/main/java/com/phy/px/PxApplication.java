package com.phy.px;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.phy.py.dao"})
public class PxApplication {

    public static void main(String[] args) {
        SpringApplication.run(PxApplication.class, args);
    }

}
