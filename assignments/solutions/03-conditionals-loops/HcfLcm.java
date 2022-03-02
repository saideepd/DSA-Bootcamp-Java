// HCF & LCM Calculator

import java.util.Scanner;

public class HcfLcm {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("HCF & LCM Calculator\n");
        System.out.print("Enter 1st Number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = scan.nextInt();
        int temp = 0, temp1 = num1, temp2 = num2, hcf = 0, lcm = 0;
        
        while (temp2 != 0) {
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }
        hcf = temp1;
        lcm = (num1 * num2) / hcf;
        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
    }
}

/*
Output:

HCF & LCM Calculator

Enter 1st Number: 4
Enter 2nd Number: 14
HCF: 2
LCM: 28
*/