import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for their name
        System.out.print("Enter your name: ");
        
        // Read the name input by the user
        String name = scanner.nextLine();
        
        // Print a greeting message
        System.out.println("Hello, " + name + "!");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
