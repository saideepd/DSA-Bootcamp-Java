// Function that returns the sum of first n natural numbers

import java.util.Scanner;

public class sumOfNNaturalNumbers {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sum of first N Natural numbers");
        System.out.print("Enter the number till you want the sum: ");
        int num = scan.nextInt();

        System.out.println("\nSum of " + num + " Natural numbers = " + sumOfNNumbers(num));
    }

    private static int sumOfNNumbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    } 
}

/**
 * Output:
 * 
 * Sum of first N Natural numbers
 * Enter the number till you want the sum: 3
 * 
 * Sum of 3 Natural numbers = 6
 * 
 * 
 * Enter the number till you want the sum: 40
 * 
 * Sum of 40 Natural numbers = 820
 */