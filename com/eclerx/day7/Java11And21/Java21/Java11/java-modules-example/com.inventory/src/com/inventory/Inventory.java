package com.inventory;

import com.product.Product;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void listProducts() {
        products.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product product1 = new Product("Laptop", 1000.00);
        Product product2 = new Product("Smartphone", 600.00);

        inventory.addProduct(product1);
        inventory.addProduct(product2);

        System.out.println("Inventory List:");
        inventory.listProducts();
    }
}
