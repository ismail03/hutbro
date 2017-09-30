package com.ismail.hutbro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ismail.hutbro.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
