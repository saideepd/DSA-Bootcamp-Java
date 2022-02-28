// Calculate Discount Of Product

import java.util.Scanner;

public class discountOfProduct {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Discount Of Product\n");
        System.out.print("Enter value of product: ");
        int product = scan.nextInt();
        System.out.print("Enter discount of product: ");
        int discount = scan.nextInt();
        double discountedPrice = product - ((discount * product) / 100);
        System.out.printf("Discount of " + discount + " on product of Price " + product + " = " + discountedPrice + "\n");
    }
}

/*
Output:

Discount Of Product

Enter value of product: 400
Enter discount of product: 10
Discount of 10 on product of Price 400 = 360.0
*/