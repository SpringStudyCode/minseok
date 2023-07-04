package com.test.SpringBootApi.service;

import com.test.SpringBootApi.domain.Product;

import java.util.Optional;

public interface ProductService {

    public Product save(Product product);
    public Optional<Product> findById(Long id);
    public Product update(Long id, Product product);
    public void delete(Long id);

}

// 데이터 가공, 변환
// Optional : null 을 조회하는 경우에 알맞게 처리해주는 역할