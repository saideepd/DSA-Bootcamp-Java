// Pefect Number Checker

import java.util.Scanner;

public class perfectNumber {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Perfect Number Checker\n");
        System.out.print("Enter number: ");
        int input = scan.nextInt();
        int sum = 0;
        System.out.printf("Factors of %d: ", input);
        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println(sum);
        if (input == sum)
            System.out.println("\n" + input + " is a Perfect Number");
        else
            System.out.println("\n" + input + " is not a Perfect Number");
    }
}

/*
Output:

Perfect Number Checker

Enter number: 28
Factors of 28: 1 2 4 7 14 28

28 is a Perfect Number


Enter number: 12
Factors of 12: 1 2 3 4 6 16

12 is not a Perfect Number
*/