package com.example.demo.dao;

import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository("postgres")
public class PostgresDB implements ProductDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PostgresDB(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public int addProduct(UUID id, Product product) {
        String sql = "" +
                "INSERT INTO Product (" +
                " id, " +
                " name) " +
                "VALUES (?, ?)";
        jdbcTemplate.update(
                sql, id, product.getName()
                );
            return 1;
    }

    @Override
    public List<Product> getProducts() {
        final String sql ="SELECT id, name FROM product";
        return jdbcTemplate.query(sql, (resultSet, i) -> {
            UUID id = UUID.fromString(resultSet.getString("id"));
            String name = resultSet.getString("name");
                return new Product(id, name);
        });
    }

    @Override
    public int deleteProductById(UUID id) {
        String sql = "" +
                "DELETE FROM Product " +
                "WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public int updateProductById(Product product) {
        return 0;
    }
}
