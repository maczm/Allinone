package com.allinone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.allinone.mapper")
public class AllinoneApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(AllinoneApplication.class, args);
    }
    
}
