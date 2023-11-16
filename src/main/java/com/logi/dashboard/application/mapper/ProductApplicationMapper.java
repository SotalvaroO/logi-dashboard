package com.logi.dashboard.application.mapper;

import com.logi.dashboard.application.dto.ProductResponse;
import com.logi.dashboard.domain.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;


@Mapper
public interface ProductApplicationMapper {

    ProductApplicationMapper INSTANCE = Mappers.getMapper(ProductApplicationMapper.class);

    public ProductResponse productToProductResponse(Product product);

}
