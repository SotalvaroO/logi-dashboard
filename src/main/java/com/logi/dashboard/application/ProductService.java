package com.logi.dashboard.application;

import com.logi.dashboard.application.dto.ProductResponse;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public interface ProductService {

    List<ProductResponse> findAllProducts(Integer limit, Integer skip) throws URISyntaxException, IOException, InterruptedException;

}
