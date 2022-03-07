// Factorial of a Number

import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Factorial of a number");
        System.out.print("\nEnter number: ");
        int num = scan.nextInt();
        System.out.printf("Factorial of %d = %d\n", num, factorial(num));
    }

    private static int factorial(int num) {
        if (num == 0)
            return 1;
        else
            return num * factorial(num - 1);
    }
}

/**
 * Output:
 * 
 * Factorial of a number
 * 
 * Enter number: 6
 * Factorial of 6 = 720
 * 
 * Enter number: 0
 * Factorial of 0 = 1
 */