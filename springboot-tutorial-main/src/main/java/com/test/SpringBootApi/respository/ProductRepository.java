package com.test.SpringBootApi.respository;

import com.test.SpringBootApi.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

// Repository : 저장소
// 데이터베이스에 스프링의 요청을 직접적으로 전달해서 데이터베이스가 변경되는
// 일련의 과정들을 처리함

// <Product, Long> : <객체, Id 타입>
