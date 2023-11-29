package com.logi.dashboard.api;

import com.google.gson.Gson;
import com.logi.dashboard.application.ProductService;
import com.logi.dashboard.application.ProductServiceImpl;
import com.logi.dashboard.application.mapper.ProductApplicationMapper;
import com.logi.dashboard.domain.port.ProductRepository;
import com.logi.dashboard.infra.adapter.ProductClient;
import com.logi.dashboard.infra.http.ProductHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.http.HttpClient;

@Configuration
public class StartConfig {

    @Bean
    public ProductHttpClient productHttpClient(@Value("${external.api.url}") String url) {
        return new ProductHttpClient(HttpClient.newHttpClient(), new Gson(), url);
    }

    @Bean
    public ProductRepository productRepository(ProductHttpClient productHttpClient) {
        return new ProductClient(productHttpClient);
    }

    @Bean
    public ProductService productService(ProductRepository productRepository, ProductApplicationMapper productApplicationMapper) {
        return new ProductServiceImpl(productRepository, productApplicationMapper);
    }

}
