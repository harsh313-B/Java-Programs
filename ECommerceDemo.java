// Importing Scanner for user input
import java.util.Scanner;

// Abstract class: acts as a blueprint for all products
abstract class Product {
    String name;
    double price;

    // Constructor
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Abstract method (must be implemented by subclasses)
    abstract void displayDetails();

    // Concrete method (shared by all)
    void applyDiscount(double percent) {
        double discount = (price * percent) / 100;
        price -= discount;
        System.out.println("Discount of " + percent + "% applied. New price: ₹" + price);
    }
}

// Electronics class inherits from Product
class Electronics extends Product {
    int warranty; // warranty in years

    // Constructor
    Electronics(String name, double price, int warranty) {
        super(name, price); // call parent constructor
        this.warranty = warranty;
    }

    // Method overriding (Dynamic Polymorphism)
    void displayDetails() {
        System.out.println("\n--- Electronics Product ---");
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Warranty: " + warranty + " years");
    }
}

// Clothing class inherits from Product
class Clothing extends Product {
    String size;
    String fabric;

    Clothing(String name, double price, String size, String fabric) {
        super(name, price);
        this.size = size;
        this.fabric = fabric;
    }

    // Method overriding
    void displayDetails() {
        System.out.println("\n--- Clothing Product ---");
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Size: " + size);
        System.out.println("Fabric: " + fabric);
    }
}

// Main class demonstrating Inheritance, Abstract Class, and Polymorphism
public class ECommerceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dynamic Polymorphism: Product reference, object decided at runtime
        Product product;

        System.out.println("Choose Product Type: ");
        System.out.println("1. Electronics");
        System.out.println("2. Clothing");
        int choice = sc.nextInt();

        sc.nextLine(); // consume leftover newline

        if (choice == 1) {
            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Warranty (in years): ");
            int warranty = sc.nextInt();

            product = new Electronics(name, price, warranty);
        } else {
            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter Size: ");
            String size = sc.nextLine();
            System.out.print("Enter Fabric: ");
            String fabric = sc.nextLine();

            product = new Clothing(name, price, size, fabric);
        }

        // Polymorphic call — runs subclass's version at runtime
        product.displayDetails();

        // Demonstrate concrete method from abstract class
        product.applyDiscount(10.0);

        sc.close();
    }
}
