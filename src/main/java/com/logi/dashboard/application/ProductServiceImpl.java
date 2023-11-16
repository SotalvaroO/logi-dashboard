package com.logi.dashboard.application;

import com.logi.dashboard.application.dto.ProductResponse;
import com.logi.dashboard.application.mapper.ProductApplicationMapper;
import com.logi.dashboard.domain.port.ProductRepository;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;


public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductResponse> findAllProducts(Integer limit, Integer skip) throws URISyntaxException, IOException, InterruptedException {
        return this.productRepository
                .findAllProducts(limit, skip)
                .stream().map(ProductApplicationMapper.INSTANCE::productToProductResponse).toList();
    }
}
