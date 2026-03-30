package org.example.service;
import org.example.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1L, "Produto A", "Descrição do Produto A", 10));
        products.add(new Product(2L, "Produto B", "Descrição do Produto B", 20));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product createProduct(Product product) {
        products.add(product);
        return product;
    }
}
