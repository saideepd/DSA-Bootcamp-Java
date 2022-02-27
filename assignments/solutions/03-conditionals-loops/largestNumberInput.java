// Largest Number from Input
// Take integer inputs till the user enters 0 and print the largest number from all

import java.util.Scanner;

public class largestNumberInput {
    public static void main (String args[]) {
        int result = 0, input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Largest Number from Input\n");
        System.out.println("Keep on Entering Numbers to find the Largest Number");
        System.out.println("Enter 0 to stop entering numbers");
        
        while ((input = scan.nextInt()) != 0) {
            if(input > result)
                result = input;
        }
        System.out.println("Largest of all Numbers = " + result);
    }
}

/*
Output:

Largest Number from Input

Keep on Entering Numbers to find the Largest Number
Enter 0 to stop entering numbers
2
4
5
6
7
2
5
2
0
Largest of all Numbers = 7
*/