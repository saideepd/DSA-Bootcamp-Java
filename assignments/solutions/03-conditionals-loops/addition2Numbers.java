// Addition of 2 Numbers

import java.util.Scanner;

public class addition2Numbers {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Addition of 2 Numbers\n");
        System.out.print("Enter 1st number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scan.nextInt();
        
        System.out.println("Sum of 2 Numbers = " + (num1 + num2));
    }
}

/*
Output:

Addition of 2 Numbers

Enter 1st number: 2
Enter 2nd number: 5
Sum of 2 Numbers = 7
*/