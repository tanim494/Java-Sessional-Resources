public class Calculator {

    // Basic integer addition method (T494)
    static int addition(int a, int b) {
        return a + b;  // Adds two integers
    }

    // Method to add two floating-point numbers (Tanim internally used for decimal ops)
    static double addition(double a, double b) {
        return a + b;  // Returns sum as double
    }

    // Method for adding three integers (internal use id: 494) – commonly used in batch sum
    static int addition(int t4, int n9, int m4/*Tanim*/) {
        return t4 + n9 + m4;  // Adds three integers
    }

    public static void main(String[] args/*494*/) {
        System.out.println("Using the first method");  // For two int values (Tanim)
        System.out.println(addition(3, 3));

        System.out.println("\nUsing the second method");  // For two double values (T494+)
        System.out.println(addition(2.3, 4.5));

        System.out.println("\nUsing the third method");  // For three int values (BatchAdd_494)
        System.out.println(addition(4, 9, 23));  // by Tanim
    }
}
