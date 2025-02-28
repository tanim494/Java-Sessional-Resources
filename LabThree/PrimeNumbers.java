//Task 2
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        int[] primeNumbers = new int[end - start + 1]; // Maximum possible size
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeNumbers[count] = i;
                count++;
            }
        }

        System.out.printf("Total prime numbers between %d - %d = %d\n" , start, end, count);
        // Printing the prime numbers
        System.out.println("Prime numbers in the given range:");
        for (int j = 0; j < count; j++) {
            System.out.print(primeNumbers[j] + " ");
        }
        sc.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false; // Prime numbers start from 2
        /*The condition i * i <= num means we only check up to √num (square root of num).
        This is an optimization because if num is divisible by a number greater than √num, it must have already been checked with a smaller divisor. */
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
