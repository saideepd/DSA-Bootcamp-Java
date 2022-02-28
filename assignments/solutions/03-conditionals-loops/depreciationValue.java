// Calculate Depreciation of Value

import java.util.Scanner;

public class depreciationValue {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Depreciation of Value\n");
        System.out.print("Enter value: ");
        float value = scan.nextFloat();
        System.out.print("Enter Rate of Depreciation: ");
        float rate = scan.nextFloat();
        System.out.print("Enter Number of Years: ");
        int years = scan.nextInt();
        double depreciatedValue = value * Math.pow((1 - rate / 100),years);
        System.out.printf("Deprciation of ₹%.2f over period of %d years at %.2f p.c.p.a = %.2f\n", value, years, rate, depreciatedValue);
    }
}

/*
Output:

Depreciation of Value

Enter value: 500
Enter Rate of Depreciation: 7
Enter Number of Years: 2
Deprciation of ₹500.00 over period of 2 years at 7.00 p.c.p.a = 432.45
*/