package com.it.de_one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//@MapperScan("com.it.de_one.mapper")
@EnableCaching
@MapperScan("com.it.de_one.mapper")
public class DeOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeOneApplication.class, args);
    }

}
