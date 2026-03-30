package org.example.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;

public class Product {

    private UUID id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotNull
    private Integer stockQuantity;

    public Product() {
        this.id = UUID.randomUUID(); 
    }

    public Product(String name, String description, Integer stockQuantity) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.stockQuantity = stockQuantity;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}