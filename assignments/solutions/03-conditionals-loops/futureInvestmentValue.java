// Future Investment Value Calculator

import java.util.Scanner;

public class futureInvestmentValue {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Future Investment Value Calculator\n");
        System.out.print("Enter Present Value: ");
        float presentValue = scan.nextFloat();
        System.out.print("Enter Interest Rate: ");
        float rate = scan.nextFloat();
        System.out.print("Enter Time Period (in years): ");
        float time = scan.nextFloat();

        double futureValue = presentValue * Math.pow((1 + (rate / 100)), time);
        System.out.printf("\nFuture Investment Value = %.2f\n", futureValue);
    }
}

/*
Output:

Future Investment Value Calculator

Enter Present Value: 3000
Enter Interest Rate: 8
Enter Time Period (in years): 3

Future Investment Value = 3779.14
*/