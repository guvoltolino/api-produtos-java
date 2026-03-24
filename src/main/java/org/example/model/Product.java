package org.example.model;

public class Product {
    private Long id;
    public String name;
    public String description;
    public Integer stockQuantity;

    public Product(Long id, String name, String description, Integer stockQuantity){
        this.id = id;
        this.name = name;
        this.description = description;
        this.stockQuantity = stockQuantity;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
