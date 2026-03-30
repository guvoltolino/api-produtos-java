package org.example.service;

import org.example.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product("Produto A", "Descrição do Produto A", 10));
        products.add(new Product("Produto B", "Descrição do Produto B", 20));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product createProduct(Product product) {
        if (product.getId() == null) {
            product.setId(UUID.randomUUID());
        }
        products.add(product);
        return product;
    }

    public Product updateProduct(UUID id, Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(id)) {
                product.setId(id);
                products.set(i, product);
                return product;
            }
        }
        return null; 
    }

    public void deleteProduct(UUID id) {
        products.removeIf(product -> product.getId().equals(id));
    }
}