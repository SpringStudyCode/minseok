package com.test.SpringBootApi.service;

import com.test.SpringBootApi.domain.Product;
import com.test.SpringBootApi.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired // 꼭 작성해주자
    private ProductRepository productRepository;

    @Override
    public Product save(Product product) {

        try{
            // try - catch 로 모든 명령을 감싸줌
            // 예기지 못한 상황의 예외를 적절하게 처리해야 안전

            return productRepository.save(
                    new Product(
                            product.getProductName(),
                            product.getPrice()
                    )
            );
        }
        catch (Exception e){
            e.printStackTrace(); // 예외 발생 로그 출력
        }

        return null;
    }

    @Override
    public Optional<Product> findById(Long id) {
        try{
            Optional<Product> productData = productRepository.findById(id);
            if (productData.isPresent()){
                return productData;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Product update(Long id, Product product) {
        try{
            Optional<Product> productData = productRepository.findById(id);
            if (productData.isPresent()){
                // _product : 신 데이터 (새로운 값을 받아서 덮어쓴 데이터)
                Product _product = productData.get();
                _product.setProductName(product.getProductName());
                _product.setPrice(product.getPrice());
                productRepository.save(_product);
                return _product;
            }
            else return null;
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void delete(Long id) {

        try{
            productRepository.deleteById(id);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
