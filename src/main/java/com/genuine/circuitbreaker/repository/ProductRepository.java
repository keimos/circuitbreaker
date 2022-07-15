package com.genuine.circuitbreaker.repository;

import com.genuine.circuitbreaker.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductRepository {

    private List<Product> products;

    public ProductRepository() {
        products = Arrays.asList(
                new Product(1, "Air Valve", 300),
                new Product(2, "Break Pads", 300),
                new Product(3, "Catalytic Converter", 400),
                new Product(4, "Diesel Oxidation Catalyst", 400)
        );
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> findByQuantity(int qty) {
        List<Product> result = new ArrayList<Product>();
        for (Product p : this.products) {
            if (p.getQuantity() == qty) {
                result.add(p);
            }
        }
        return result;
    }
}
