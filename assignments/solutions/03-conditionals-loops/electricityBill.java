// Calculate Electricity Bill

import java.util.Scanner;

public class electricityBill {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Electricity Bill\n");
        System.out.print("Enter Units of Electricity consumed: ");
        int units = scan.nextInt();

        double billAmount = 0;
        if (units < 100) {
            billAmount = units * 1.2;
        }
        else if (units < 300) {
            billAmount = 100 * 1.2 + (units - 100) * 2;
        }
        else if (units > 300) {
            billAmount = 100 * 1.2 + 200 * 2 + (units - 300) * 3;
        }

        System.out.println("Total Electricity Bill Amount for " + units + " is ₹" + billAmount);
    }
}

/*
Output:

Electricity Bill

Enter Units of Electricity consumed: 90
Total Electricity Bill Amount for 90 is ₹108.0


Electricity Bill

Enter Units of Electricity consumed: 250
Total Electricity Bill Amount for 250 is ₹420.0


Electricity Bill

Enter Units of Electricity consumed: 400
Total Electricity Bill Amount for 400 is ₹820.0
*/