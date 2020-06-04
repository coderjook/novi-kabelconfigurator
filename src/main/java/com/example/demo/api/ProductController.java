package com.example.demo.api;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/product")
@RestController
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) { productService.AddProduct(product); }

    @GetMapping
    public List<Product> getProducts(){ return productService.getProducts(); }

    @DeleteMapping(path = "{id}")
    public void deleteProduct(@PathVariable("id") UUID id) {
        productService.deleteProduct(id);
    }

    @PutMapping
    public void updateProduct(@RequestBody Product productToUpdate) {
        productService.updateProduct(productToUpdate);
    }

}
