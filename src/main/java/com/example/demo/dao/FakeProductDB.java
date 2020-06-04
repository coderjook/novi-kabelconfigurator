package com.example.demo.dao;

import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakedb")
public class FakeProductDB implements ProductDao{

    private static List<Product> DB = new ArrayList<>();

    @Override
    public int addProduct(UUID id, Product product) {
        DB.add(new Product(id,product.getName()));
        return 1;
    }

    @Override
    public List<Product> getProducts(){
        return DB;
    }


    private Optional<Product> getProductById(UUID id){
        //zoek de id op in de DB en kijk naar een Match
        return DB.stream()
                .filter( p -> p.getID().equals(id))
                .findFirst();

    }

    @Override
    public int deleteProductById(UUID id){
        //product verwijderen
        Optional<Product> product = getProductById(id);

        if (product.isPresent()) {
            DB.remove(product.get());
                return 1;

        } else {
            return 0;
        }
    }

    @Override
    public int updateProductById(Product productToUpdate){
        //update product
        Optional<Product> product = getProductById(productToUpdate.getID());

        if(product.isPresent()) {
            DB.set(DB.indexOf(product.get()), productToUpdate);
            return 1;
        } else {
            return 0;
        }

    }

}



