package com.logi.dashboard.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URISyntaxException;

@SpringBootApplication(scanBasePackages = "com.logi.dashboard")
public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        SpringApplication.run(Main.class, args);
    }
}