package com.productcatalogsystem.productcatalogsystem.service;

import com.productcatalogsystem.productcatalogsystem.entity.Product;
import com.productcatalogsystem.productcatalogsystem.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return (List<Product>) productRepository.findAll();
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
