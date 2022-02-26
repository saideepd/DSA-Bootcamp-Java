// Largest Number program

import java.util.Scanner;

public class largestNumber {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Largest Number");
        System.out.print("Enter 1st number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scan.nextInt();

        if (num1 == num2)
            System.out.println("Equal Numbers");
        else {
            int result = num1 > num2 ? num1 : num2;
            System.out.println("Largest Number: " + result);
        }
    }
}

/*
Output:

Largest Number
Enter 1st number: 4
Enter 2nd number: 1
Largest Number: 4

Largest Number
Enter 1st number: 3
Enter 2nd number: 3
Equal Numbers
*/