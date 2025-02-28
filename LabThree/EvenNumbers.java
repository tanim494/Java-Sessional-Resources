//Task 1
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        // Maximum possible size of the array
        int[] evenNumbers = new int[(end - start) / 2 + 1];
        int count = 0;

        int i = start;
        while (i <= end) {
            if (i % 2 == 0) {
                evenNumbers[count] = i;
                count++;
            }
            i++;
        }

        // Printing the even numbers
        System.out.println("Even numbers in the given range:");
        for (int j = 0; j < count; j++) {
            System.out.print(evenNumbers[j] + " ");
        }

        sc.close();
    }
}
