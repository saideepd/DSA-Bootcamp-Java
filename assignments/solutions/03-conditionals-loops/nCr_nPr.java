// Armstrong Number

import java.util.Scanner;

public class nCr_nPr {
    public static void main (String args[]) {
        int temp = 0, sum = 0, original = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("nCr & nPr\n");
        System.out.print("Enter value of n: ");
        int n = scan.nextInt();
        System.out.print("Enter value of r: ");
        int r = scan.nextInt();
        double nCr = factorial(n) / (factorial(r) * factorial(n - r));
        double nPr = factorial(n) / factorial(n - r);
        System.out.printf("nCr: %dC%d = %.2f\n", n, r, nCr);
        System.out.printf("nPr: %dP%d = %.2f\n", n, r, nPr);
    }

    static int factorial (int input) {
        if (input <= 1)
            return 1;
        else
            return input * factorial(input-1);
    }
}

/*
Output:

nCr & nPr

Enter value of n: 5
Enter value of r: 2
nCr: 5C2 = 10.00
nPr: 5P2 = 20.00
*/