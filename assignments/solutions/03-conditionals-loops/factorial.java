// Factorial of a Number

import java.util.Scanner;

public class factorial {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Factorial of a number");
        System.out.print("Enter number to find factorial: ");
        int num = scan.nextInt();
        int result = factorial(num);
        System.out.printf("Factorial of %d = %d\n", num, result);
    }

    static int factorial(int num) {
        if (num == 0)
            return 1;
        else
            return num * factorial(num - 1);
    }
}

/*
Output:

Factorial of a number
Enter number to find factorial: 6
Factorial of 6 = 720
*/