package com.logi.dashboard.infra.adapter;

import com.logi.dashboard.domain.entity.Product;
import com.logi.dashboard.domain.port.ProductRepository;
import com.logi.dashboard.infra.http.ProductHttpClient;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class ProductClient implements ProductRepository {

    private final ProductHttpClient productHttpClient;
    public ProductClient(ProductHttpClient productHttpClient) {
        this.productHttpClient = productHttpClient;
    }


    @Override
    public List<Product> findAllProducts(Integer limit, Integer skip) throws URISyntaxException, IOException, InterruptedException {
        /*products.forEach(product -> product.setThumbnail(
                removeLastCharacter(product.getThumbnail())
        ));*/
        return productHttpClient.findAll(limit, skip).getProducts();
    }

    private String removeLastCharacter(String str) {
        if (str != null && str.length() > 0) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }
}
