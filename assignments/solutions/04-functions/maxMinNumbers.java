// Maximum & Minimum among 3 numbers from input

import java.util.Scanner;
public class maxMinNumbers {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Maximum & Minimum Numbers");
        System.out.print("\nEnter number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scan.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = scan.nextInt();

        System.out.println("\nMaximum Number = " + maximumNumber(num1, num2, num3));
        System.out.println("\nMinimum Number = " + minimumNumber(num1, num2, num3));
    }

    static int maximumNumber(int a, int b, int c) {
        return a > b && a > c ? a : b > c ? b : c; 
    }

    static int minimumNumber(int a, int b, int c) {
        return a < b && a < c ? a : b < c ? b : c;
    }
}

/*
Output:

Maximum & Minimum Numbers

Enter number 1: 3
Enter number 2: 1
Enter number 3: 5

Maximum Number = 5

Minimum Number = 1
*/