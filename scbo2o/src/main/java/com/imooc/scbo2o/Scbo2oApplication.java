package com.imooc.scbo2o;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class Scbo2oApplication {

    public static void main(String[] args) {
        SpringApplication.run(Scbo2oApplication.class, args);
    }

}
