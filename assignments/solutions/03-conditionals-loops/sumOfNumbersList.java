// Sum of Negative Numbers, Positive Even Numbers, Positive Even Numbers
// from List of Input numbers until user inputs 0

import java.util.Scanner;

public class sumOfNumbersList {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sum of Negative, Positive Even & Odd Numbers\n");
        System.out.println("Enter 0 to stop input");
        System.out.println("Start entering numbers:");
        int negativeSum = 0, positiveEvenSum = 0, positiveOddSum = 0;
        int number;
        while((number = scan.nextInt()) != 0) {
            if (number < 0)
                negativeSum += number;
            else if (number > 0 && number % 2 == 0)
                positiveEvenSum += number;
            else
                positiveOddSum += number;
        }
        System.out.println("Negative Sum = " + negativeSum);
        System.out.println("Positive Even Sum = " + positiveEvenSum);
        System.out.println("Positive Odd Sum = " + positiveOddSum);
    }
}

/*
Output:

Sum of Negative, Positive Even & Odd Numbers

Enter 0 to stop input
Start entering numbers:
1
3 
4
6
9
5
-2
4
-6
0
Negative Sum = -8
Positive Even Sum = 14
Positive Odd Sum = 18
*/