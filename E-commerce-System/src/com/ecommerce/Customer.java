package com.ecommerce;

import java.util.ArrayList;
import java.util.List;
import com.ecommerce.orders.Order;

public class Customer {
    // Attributes representing customer details
    private int customerID;
    private String name;
    private List<Product> shoppingCart;

    // Constructor to initialize Customer object
    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.shoppingCart = new ArrayList<>();
    }

    // Getters and setters for customer attributes
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    // Adds a product to the shopping cart
    public void addProductToCart(Product product) {
        shoppingCart.add(product);
    }

    // Removes a product from the shopping cart
    public void removeProductFromCart(Product product) {
        shoppingCart.remove(product);
    }

    // Calculates the total cost of the products in the shopping cart
    public double calculateTotalCost() {
        double total = 0;
        for (Product product : shoppingCart) {
            total += product.getPrice();
        }
        return total;
    }

    // Places an order for the products in the shopping cart
    public Order placeOrder() {
        // Create a new Order object with the current shopping cart contents
        Order order = new Order(Order.getNextOrderID(), this, new ArrayList<>(shoppingCart));
        // Clear the shopping cart after placing the order
        shoppingCart.clear();
        return order;
    }
}
