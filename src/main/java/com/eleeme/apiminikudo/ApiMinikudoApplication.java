package com.eleeme.apiminikudo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ApiMinikudoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiMinikudoApplication.class, args);
    }

}
