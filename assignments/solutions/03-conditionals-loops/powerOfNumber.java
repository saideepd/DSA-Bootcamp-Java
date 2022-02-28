// Power In Java

import java.util.Scanner;

public class powerOfNumber {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Power In Java\n");
        System.out.print("Enter Number: ");
        int number = scan.nextInt();
        System.out.print("Enter Power: ");
        int power = scan.nextInt();
        System.out.println("Power of Number " + number + " = " + Math.pow(number, power));
    }
}

/*
Output:

Enter Amount: 300
Enter Commission Percentage: 2
Total Commission: 6.0
*/