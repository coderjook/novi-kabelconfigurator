package com.example.demo.dao;

import com.example.demo.model.Product;

import java.util.List;
import java.util.UUID;

public interface ProductDao {

    int addProduct(UUID id, Product product);

    default int addProduct(Product product) {
        UUID id = UUID.randomUUID();
        return addProduct(id, product);
    }

    List<Product> getProducts();

    int deleteProductById(UUID id);

    int updateProductById(Product product);
}
