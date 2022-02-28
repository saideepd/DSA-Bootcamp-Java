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

Power In Java

Enter Number: 6
Enter Power: 3
Power of Number 6 = 216.0
*/