//Task 2
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        ArrayList<Integer> primeList = new ArrayList<>();//Benefit of array list, you dont have to specify the size. You can add variables dynamically
        int[] primeNumbers = new int[end - start + 1]; // Maximum possible size
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeNumbers[count] = i;
                primeList.add(i);
                count++;
            }
        }

        System.out.printf("Total prime numbers between %d - %d = %d\n" , start, end, count);
        System.out.println("This is from ArrayList: ");
        for (int i: primeList) {
            System.out.printf("%d ", i);
        }
        // Printing the prime numbers
        System.out.println("\nThis is from Array:");
        for (int j = 0; j < count; j++) {
            System.out.print(primeNumbers[j] + " ");
        }
        sc.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true; //2 , only even prime
        if (num % 2 == 0) return false; // all even are not prime except 2
        /*The condition i * i <= num means we only check up to √num (square root of num). or you can use i <= Math.sqrt(num)
        This is an optimization because if num is divisible by a number greater than √num, it must have already been checked with a smaller divisor. */
        for (int i = 3; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
