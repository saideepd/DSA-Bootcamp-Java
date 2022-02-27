// Sum of All Numbers
// Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;

public class sumOfAllNumbers {
    public static void main (String args[]) {
        int result = 0, input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sum of All Numbers\n");
        System.out.println("Keep on Entering Numbers to print their Sum");
        System.out.println("Enter -1 to stop entering numbers");
        
        while ((input = scan.nextInt()) != -1) {
            if(input == -1) break;
            result += input;
        }
        System.out.println("Sum of all Numbers = " + result);
    }
}

/*
Output:

Sum of All Numbers

Keep on Entering Numbers to print their Sum
Enter -1 to stop entering numbers
9
3
44
5
-1
Sum of all Numbers = 61
*/