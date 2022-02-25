// Simple Interest

import java.util.*;

public class simpleInterest {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Simple Interest\n");
        System.out.print("Enter Principal Amount: ");
        float principal = scan.nextFloat();
        System.out.print("Enter Time (in years): ");
        float time = scan.nextFloat();
        System.out.print("Enter Rate of Interest (in years): ");
        float rate = scan.nextFloat();
        float si = (principal * time * rate) / 100;
        System.out.println("Simple Interest: " + si);
    }
}

/*
Output;

Simple Interest

Enter Principal Amount: 100
Enter Time (in years): 2
Enter Rate of Interest (in years): 3
Simple Interest: 6.0
*/