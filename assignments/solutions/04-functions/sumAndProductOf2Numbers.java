// Sum & Product of 2 numbers from input

import java.util.Scanner;
public class sumAndProductOf2Numbers {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sum & Product of 2 Numbers");
        System.out.print("\nEnter number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scan.nextInt();

        System.out.println("\nSum of Numbers = " + sum(num1, num2));
        System.out.println("\nProduct of Numbers = " + product(num1, num2));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int product(int a, int b) {
        return a * b;
    }
}

/*
Output:

Sum & Product of 2 Numbers

Enter number 1: 5
Enter number 2: 9

Sum of Numbers = 14

Product of Numbers = 45
*/