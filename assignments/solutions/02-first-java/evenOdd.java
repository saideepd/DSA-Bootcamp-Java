/*
Print input number is Even or Odd
*/

import java.util.Scanner;

public class evenOdd {
    public static void main (String arg[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Even Odd Number");
        System.out.print("Enter number: ");
        int input = scan.nextInt();
        if (input % 2 == 0)
            System.out.println("The number " + input + " is Even");
        else
            System.out.println("The number " + input + " is Odd");
    }
}

/*
Output:

Even Odd Number
Enter number: 2
The number 2 is Even

Even Odd Number
Enter number: 5
The number 5 is Odd
 */