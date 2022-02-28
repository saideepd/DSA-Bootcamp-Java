// Calculate Average Of N Numbers

import java.util.Scanner;

public class averageOfNNumbers {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Average of N Numbers\n");
        System.out.print("How many numbers do you want to find the average of? : ");
        int n = scan.nextInt();
        int num = 0, sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            num = scan.nextInt();
            sum += num;
        }
        float avg = sum / n;
        System.out.printf("Average of " + n + " numbers = " + avg + "\n");
    }
}

/*
Output:

Average of N Numbers

How many numbers do you want to find the average of? : 6
Enter number 1: 2
Enter number 2: 5
Enter number 3: 1
Enter number 4: 6
Enter number 5: 8
Enter number 6: 3
Average of 6 numbers = 4.0
*/