package com.example.demo.service;

import com.example.demo.dao.ProductDao;
import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductDao productDao;

    public ProductService(@Qualifier("postgres") ProductDao productDao){ this.productDao = productDao; }

    public int AddProduct(Product product) {return productDao.addProduct(product); }

    public List<Product> getProducts(){
        return productDao.getProducts();
    }

    public int deleteProduct(UUID id) {
        return productDao.deleteProductById(id);
    }

    public int updateProduct(Product productToUpdate) {
        return productDao.updateProductById(productToUpdate);
    }
}
