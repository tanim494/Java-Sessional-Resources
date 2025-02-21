//Lab 2, Task 2
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result;

        switch (operator) {
            case '+': result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-': result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*': result = num1 * num2;
                System.out.println("Result: " + result);
                break;//T494
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {//Tanim494
                    System.out.println("Error! Division by zero.");
                }
                break;
            default: System.out.println("Invalid operator!");
        }
        sc.close();
    }
}
