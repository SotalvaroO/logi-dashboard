package com.logi.dashboard.domain.port;

import com.logi.dashboard.domain.entity.Product;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public interface ProductRepository {

    List<Product> findAllProducts(Integer limit, Integer skip) throws URISyntaxException, IOException, InterruptedException;

}
