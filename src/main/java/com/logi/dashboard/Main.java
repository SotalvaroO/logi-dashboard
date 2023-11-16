package com.logi.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URISyntaxException;

@SpringBootApplication
public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        SpringApplication.run(Main.class,args);
        /*ProductRepository repository = new ProductClient(new ProductHttpClient());
        List<Product> allProducts = repository.findAllProducts(10, 0);
        System.out.println(allProducts);*/

    }
}