package com.logi.dashboard.infra.entity;

import com.logi.dashboard.domain.entity.Product;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Response {
    List<Product> products;

}
