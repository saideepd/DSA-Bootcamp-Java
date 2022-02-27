// Subtract Product and Sum of the Digits of an Integer

import java.util.Scanner;

public class subtractProductAndSum {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Subtract the Product and Sum of Digits of an Integer\n");
        System.out.print("Enter Number: ");
        int input = scan.nextInt();

        int product = 1, sum = 0, original = input;
        while (input > 0) {
            int temp = input % 10;
            input = input / 10;
            product *= temp;
            sum += temp;
        }

        int result = product - sum;
        System.out.printf("Difference between the Product and Sum of Digits of %d = %d\n", original, result);
    }
}

/*
Output:

Subtract the Product and Sum of Digits of an Integer

Enter Number: 234
Difference between the Product and Sum of Digits of 234 = 15
*/