package com.logi.dashboard.api;

import com.logi.dashboard.domain.port.ProductRepository;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URISyntaxException;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<?> findAllProducts(@RequestParam(name = "limit", required = false, defaultValue = "0") Integer limit, @RequestParam(name = "skip", required = false, defaultValue = "0") Integer skip) throws URISyntaxException, IOException, InterruptedException {
        return ResponseEntity.ok(productRepository.findAllProducts(limit, skip));
    }

}
