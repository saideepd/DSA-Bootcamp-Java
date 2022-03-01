// Compound Interest Calculator

import java.util.Scanner;

public class compoundInterest {
    public static void main (String args[]) {
        double principal = 0, rate = 0, time = 0, total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Compound Interest Calculator\n");
        System.out.print("Enter Principal Amount: ");
        principal = scan.nextFloat();
        System.out.print("Enter Rate of Interest: ");
        rate = scan.nextFloat();
        System.out.print("Enter Number of Years: ");
        time = scan.nextFloat();

        total = principal * Math.pow((1 + (rate / 100)), time);
        
        System.out.printf("Compounded Total Value: %.2f\n", total);
        System.out.printf("Compounded Interest: %.2f\n", (total - principal));
    }
}

/*
Output:

Compound Interest Calculator

Enter Principal Amount: 5000
Enter Rate of Interest: 3.5
Enter Number of Years: 5
Compounded Total Value: 5938.43
Compounded Interest: 938.43
*/