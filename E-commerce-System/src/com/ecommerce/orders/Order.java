package com.ecommerce.orders;

import com.ecommerce.Customer;
import com.ecommerce.Product;
import java.util.List;

public class Order {
    // Static field to keep track of the next order ID
    private static int nextOrderID = 1;

    // Attributes representing order details
    private int orderID;
    private Customer customer;
    private List<Product> products;
    private double orderTotal;

    // Constructor to initialize Order object
    public Order(int orderID, Customer customer, List<Product> products) {
        this.orderID = orderID;
        this.customer = customer;
        this.products = products;
        this.orderTotal = calculateOrderTotal(); // Calculate the total cost of the order
    }

    // Method to get the next available order ID and increment it
    public static int getNextOrderID() {
        return nextOrderID++;
    }

    // Getters for order attributes
    public int getOrderID() {
        return orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    // Calculate the total cost of the products in the order
    private double calculateOrderTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Generate a summary of the order
    public String generateOrderSummary() {
        StringBuilder summary = new StringBuilder();
        summary.append("Order ID: ").append(orderID).append("\n");
        summary.append("Customer: ").append(customer.getName()).append("\n");
        summary.append("Products:\n");
        for (Product product : products) {
            summary.append(" - ").append(product.getName()).append(": $").append(product.getPrice()).append("\n");
        }
        summary.append("Total: $").append(orderTotal).append("\n");
        return summary.toString();
    }
}
