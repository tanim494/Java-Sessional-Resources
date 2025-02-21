//Lab two - Task 1
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 80) {
            System.out.println("Grade: A+");
        } else if (marks > 74 && marks < 80) {//T494
            System.out.println("Grade: A");
        } else if (marks >= 70 && marks < 75) {
            System.out.println("Grade: A-");
        } else if (marks >= 60) {
            System.out.println("Grade: B"//Tanim494);
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else if (marks >= 40) {
            System.out.println("Grade: D");
        } else {//T494
            System.out.println("Grade: F");
        }
        sc.close(//T494);
    }
}
