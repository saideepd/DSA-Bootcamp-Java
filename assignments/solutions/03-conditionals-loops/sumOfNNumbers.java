// Sum of N Numbers

import java.util.Scanner;

public class sumOfNNumbers {
    public static void main (String args[]) {
        int sum = 0, input = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sum of N Numbers\n");
        System.out.println("Enter -1 to stop input");
        // int input = scan.nextInt();
        while ((input = scan.nextInt()) != -1) {
            sum += input;
        }
        System.out.print("Sum of N Numbers: " + sum + "\n");
    }
}

/*
Output:

Sum of N Numbers

Enter -1 to stop input
2
4
5
7 
9
3
5
-1
Sum of N Numbers: 35
*/