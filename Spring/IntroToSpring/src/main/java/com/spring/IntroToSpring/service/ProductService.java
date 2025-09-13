package com.spring.IntroToSpring.service;

import com.spring.IntroToSpring.dto.ProductRequest;
import com.spring.IntroToSpring.dto.ProductResponse;
import com.spring.IntroToSpring.model.Product;
import com.spring.IntroToSpring.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;
    public void createProduct(ProductRequest productrequest){

        try {
            Product product = Product.builder()
                    .name(productrequest.getName())
                    .description(productrequest.getDescription())
                    .price(productrequest.getPrice())
                    .build();
            productRepository.save(product);
            log.info("Product {} is created with Id:{} ",product.getName(),product.getId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public List<ProductResponse> getAllProducts() {
        List<Product> listProduct = productRepository.findAll();
        return listProduct.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
