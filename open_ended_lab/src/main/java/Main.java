import java.util.ArrayList;
import java.util.List;

abstract class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calculateShippingCost();
}

class ElectronicProduct extends Product {
    private String manufacturer;

    public ElectronicProduct(String name, double price, int quantity, String manufacturer) {
        super(name, price, quantity);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double calculateShippingCost() {
        return 10.0;
    }
}

class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String name, double price, int quantity, String size) {
        super(name, price, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public double calculateShippingCost() {
        if (size.equalsIgnoreCase("small")) {
            return 5.0;
        } else if (size.equalsIgnoreCase("medium")) {
            return 7.0;
        } else {
            return 9.0;
        }
    }
}

abstract class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public abstract void displayUserInfo();
}

class Customer extends User {
    public Customer(String username, String email) {
        super(username, email);
    }

    @Override
    public void displayUserInfo() {
        System.out.println("Customer Info:");
        System.out.println("Username: " + getUsername());
        System.out.println("Email: " + getEmail());
    }
}

class Administrator extends User {
    public Administrator(String username, String email) {
        super(username, email);
    }

    @Override
    public void displayUserInfo() {
        System.out.println("Administrator Info:");
        System.out.println("Username: " + getUsername());
        System.out.println("Email: " + getEmail());
    }
}

class Order {
    private List<Product> products;
    private User user;

    public Order(User user) {
        this.products = new ArrayList<>();
        this.user = user;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice() * product.getQuantity(); // Adjusted to consider quantity
        }
        return total;
    }

    public User getUser() {
        return user;
    }
}


interface Payment {
    void processPayment(double amount);
}

class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount + " with card number " + cardNumber);
    }
}

class PayPalPayment implements Payment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " with email " + email);
    }
}

class OnlineStoreManager {
    private List<Product> products;
    private List<Order> orders;

    public OnlineStoreManager() {
        this.products = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product.getName());
    }

    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println("Product removed: " + product.getName());
    }

    public void editProduct(Product product, double price, int quantity) {
        product.setPrice(price);
        product.setQuantity(quantity);
        System.out.println("Product edited: " + product.getName() + " Price: " + price + " Quantity: " + quantity);
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println("Order placed for user: " + order.getUser().getUsername());
    }

    public void processPayment(Payment payment, double amount) {
        payment.processPayment(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        ElectronicProduct product1 = new ElectronicProduct("Laptop", 999.99, 10, "Dell");
        ClothingProduct product2 = new ClothingProduct("T-shirt", 19.99, 20, "Medium");

        Customer customer = new Customer("john_doe", "john@example.com");

        Order order = new Order(customer);
        order.addProduct(product1);
        order.addProduct(product2);

        customer.displayUserInfo();

        OnlineStoreManager storeManager = new OnlineStoreManager();
        storeManager.addProduct(product1);
        storeManager.addProduct(product2);

        storeManager.removeProduct(product1);

        storeManager.editProduct(product2, 25.99, 30);

        storeManager.placeOrder(order);
        CreditCardPayment payment = new CreditCardPayment("1234-5678-9012-3456");
        storeManager.processPayment(payment, order.calculateTotal());
    }
}
