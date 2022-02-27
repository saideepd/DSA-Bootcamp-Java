// Fibonacci Series

import java.util.Scanner;

public class fibonacciSeries {
    public static void main (String args[]) {
        int a = 0, b = 1, temp = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Fibonacci Series\n");
        System.out.print("Enter number to print Fibonacci Series upto: ");
        int input = scan.nextInt();
        
        System.out.println(a + "\n" + b);

        for (int i = 0; i < input-1; i++) {
            temp = b;
            b = a + b;
            a = temp;
            System.out.println(b);
        }
    }
}

/*
Output:

Fibonacci Series

Enter number to print Fibonacci Series upto: 5
0
1
1
2
3
5
*/