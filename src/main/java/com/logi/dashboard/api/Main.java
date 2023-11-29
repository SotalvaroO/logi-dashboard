package com.logi.dashboard.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.io.IOException;
import java.net.URISyntaxException;

@SpringBootApplication(scanBasePackages = "com.logi.dashboard")
public class Main /*extends SpringBootServletInitializer*/ {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        SpringApplication.run(Main.class, args);
    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(Main.class);
//    }
}