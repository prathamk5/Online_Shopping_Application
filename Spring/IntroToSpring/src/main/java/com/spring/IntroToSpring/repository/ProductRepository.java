package com.spring.IntroToSpring.repository;

import com.spring.IntroToSpring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
