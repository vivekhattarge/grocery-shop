package com.product.service;

import com.product.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product addProduct(Product product){
        Product savedProduct = productRepository.save(product);
        return savedProduct;
    }

    public Product updateProduct(Product product){
        Optional<Product> savedProuct = productRepository.findById(product.getId());
        Product existingProduct = savedProuct.get();
        existingProduct.setPrice(product.getPrice());
        return productRepository.save(existingProduct);
    }

    public List<Product> getProducts() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    public Product getById(String id) {
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()){
            return product.get();
        }
        return null;
    }
}
