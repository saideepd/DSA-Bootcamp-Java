// Even Odd Number

import java.util.Scanner;
public class evenOdd {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Even or Odd Number");
        System.out.print("\nEnter number: ");
        int num = scan.nextInt();

        System.out.println(num + " is " + (isEven(num) ? "Even" : "Odd") + " Number");
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

}

/*
Output:

Even or Odd Number

Enter number: 3
3 is Odd Number

Enter number: 456
456 is Even Number
*/