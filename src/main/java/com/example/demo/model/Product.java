package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import java.util.UUID;


@Entity
public class Product  {
    @Id
    private  UUID id;
    private String name;

    // constructor
    public Product() {}

    public Product(@JsonProperty("id") UUID id, @JsonProperty("name") String name){
        this.id = id;
        this.name = name;
    }

    public UUID getID(){
        return id;
    }
    public String getName() {
        return name;
    }
}
