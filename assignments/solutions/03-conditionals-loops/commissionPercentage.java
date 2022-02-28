// Calculate Commission Percentage

import java.util.Scanner;

public class commissionPercentage {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Commission Percentage Calculator\n");
        System.out.print("Enter Amount: ");
        float amount = scan.nextFloat();
        System.out.print("Enter Commission Percentage: ");
        float percentage = scan.nextFloat();
        float commission = (percentage / 100) * amount;
        System.out.println("Total Commission: " + commission);
    }
}

/*
Output:

Enter Amount: 300
Enter Commission Percentage: 2
Total Commission: 6.0
*/