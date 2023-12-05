package com.logi.dashboard.api;

import com.logi.dashboard.application.ProductService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URISyntaxException;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<?> findAllProducts(@RequestParam(name = "limit", required = false, defaultValue = "0") Integer limit, @RequestParam(name = "skip", required = false, defaultValue = "0") Integer skip) throws URISyntaxException, IOException, InterruptedException {
        return ResponseEntity.ok(productService.findAllProducts(limit, skip));
    }
    @GetMapping(value = "/hello")
    public ResponseEntity<?> greet(){
        return ResponseEntity.ok("Hola");
    }

}
