import com.ecommerce.Product;
import com.ecommerce.Customer;
import com.ecommerce.orders.Order;

public class Main {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product(1, "School Bags", 2500);
        Product product2 = new Product(2, "Books", 3500);
        Product product3 = new Product(3, "Sandals", 1200);
        Product product4 = new Product(4, "Pencils", 500);
        Product product5 = new Product(5, "Eraser", 70);
        Product product6 = new Product(6, "Food Flask", 1900);

        // Create customers
        Customer customer1 = new Customer(1, "Victor Nzube");
        Customer customer2 = new Customer(2, "Nkiruka Adaeze");
        Customer customer3 = new Customer(3, "Blaise Umunna");

        // Add products to shopping carts
        customer1.addProductToCart(product1);
        customer1.addProductToCart(product2);

        customer2.addProductToCart(product3);
        customer2.addProductToCart(product4);

        customer3.addProductToCart(product5);
        customer3.addProductToCart(product6);

        // Calculate total cost of the shopping carts
        System.out.println("Total cost for " + customer1.getName() + ": $" + customer1.calculateTotalCost());
        System.out.println("Total cost for " + customer2.getName() + ": $" + customer2.calculateTotalCost());
        System.out.println("Total cost for " + customer3.getName() + ": $" + customer3.calculateTotalCost());

        // Place orders and create order objects
        Order order1 = customer1.placeOrder();
        Order order2 = customer2.placeOrder();
        Order order3 = customer3.placeOrder();

        // Display the order summaries
        System.out.println(order1.generateOrderSummary());
        System.out.println(order2.generateOrderSummary());
        System.out.println(order3.generateOrderSummary());
    }
}