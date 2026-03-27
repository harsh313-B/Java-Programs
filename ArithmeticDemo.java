
import arithmetic.ArithmeticOperations;

public class ArithmeticDemo {
    public static void main(String[] args) {

        // Create object of ArithmeticOperations class
        ArithmeticOperations obj = new ArithmeticOperations();

        int x = 20;
        int y = 10;

        // Perform arithmetic operations
        System.out.println("Addition: " + obj.add(x, y));
        System.out.println("Subtraction: " + obj.subtract(x, y));
        System.out.println("Multiplication: " + obj.multiply(x, y));
        System.out.println("Division: " + obj.divide(x, y));
    }
}
