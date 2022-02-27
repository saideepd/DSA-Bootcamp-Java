// Factors of Number

import java.util.Scanner;

public class factorsOfNumber {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Factors of Number\n");
        System.out.print("Enter a number to find its factors: ");
        int input = scan.nextInt();

        System.out.printf("\nFactors of %d: ",input);
        for(int i = 1; i <= input; i++) {
            if (input % i == 0)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}

/*
Output:

Factors of Number

Enter a number to find its factors: 60

Factors of 60: 1 2 3 4 5 6 10 12 15 20 30 60 
*/