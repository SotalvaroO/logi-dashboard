package com.logi.dashboard.application.mapper;

import com.logi.dashboard.application.dto.ProductResponse;
import com.logi.dashboard.domain.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductApplicationMapperImpl implements ProductApplicationMapper{
    @Override
    public ProductResponse productToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .brand(product.getBrand())
                .category(product.getCategory())
                .description(product.getDescription())
                .discountPercentage(product.getDiscountPercentage())
                .images(product.getImages())
                .price(product.getPrice())
                .rating(product.getRating())
                .stock(product.getStock())
                .thumbnail(product.getThumbnail())
                .title(product.getTitle())
                .build();
    }
}
