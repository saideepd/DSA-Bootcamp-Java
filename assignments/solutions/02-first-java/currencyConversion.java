// Currency Conversion (INR to USD)

import java.util.Scanner;

public class currencyConversion {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Currency Conversion (INR to USD)");
        System.out.print("Enter Amount (in INR): ");
        float input = scan.nextFloat();
        double result = input / 75;
        System.out.printf("₹%.2f = $%.3f\n", input, result);
    }
}

/*
Output:

Currency Conversion (INR to USD)
Enter Amount (in INR): 200
₹200.00 = $2.667
*/