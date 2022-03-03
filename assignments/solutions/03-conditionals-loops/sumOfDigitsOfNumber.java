// Sum of Digits of Number

import java.util.Scanner;

public class sumOfDigitsOfNumber {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sum of Digits of Number\n");
        System.out.print("Enter Number: ");
        int number = scan.nextInt();
        int sum = 0, temp = 0, original = number;
        while (number > 0) {
            temp = number % 10;
            number /= 10;
            sum += temp;
        }
        System.out.printf("Sum of Digits of %d = %d\n", original, sum);
    }
}

/*
Output:

Sum of Digits of Number

Enter Number: 1235
Sum of Digits of 1235 = 11

Enter Number: 312  
Sum of Digits of 312 = 6
*/