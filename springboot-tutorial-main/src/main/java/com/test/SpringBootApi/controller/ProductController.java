package com.test.SpringBootApi.controller;

import com.test.SpringBootApi.service.ProductServiceImpl;
import com.test.SpringBootApi.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin("*") // 전체를 허용
@RestController
@RequestMapping("/api") // 어떤 경로로 사용자의 요청을 받을지
public class ProductController {

    @Autowired
    ProductServiceImpl productService;

    @GetMapping("/products/{id}")
    public ResponseEntity<Optional<Product>> getProductById(@PathVariable("id") long id) {
        try{
            return ResponseEntity.ok(productService.findById(id));
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;

    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        // RequestBody : 실제로 Product 를 만들기 위한 데이터를 전달하는 부분
        try{
            ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(productService.save(product));
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @PutMapping("/products/{id}")
    public ResponseEntity<Product> updateProduct(
            @PathVariable("id") long id,
            @RequestBody Product product
    ) {
        try{
            ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(productService.update(id, product));
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable("id") long id) {
        try{
            productService.delete(id);
            ResponseEntity.noContent();
        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
