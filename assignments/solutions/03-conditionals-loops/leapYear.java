// Leap Year Checker

import java.util.Scanner;

public class leapYear {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Leap Year Checker\n");
        System.out.print("Enter Year: ");
        int year = scan.nextInt();
        boolean isLeapYear = year % 4 == 0;
        System.out.println(year + " is " + (isLeapYear ? "Leap Year" : "not Leap Year"));
    }
}

/*
Output:

Leap Year Checker

Enter Year: 2020
2020 is Leap Year

Enter Year: 2022
2022 is not Leap Year
*/