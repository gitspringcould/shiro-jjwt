package com.jjwt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jjwt.mapper")
public class ShiroJjwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiroJjwtApplication.class, args);
    }

}
