// Sum of Digits of Number

import java.util.Scanner;

public class countOfEvenDaysInMonth {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Count of Even Days in Month\n");
        System.out.print("Enter Month number: ");
        int month = scan.nextInt();
        int monthDays = getMonthDays(month);
        if (monthDays == 0)
            System.out.println("Please enter valid month number");
        else
            System.out.printf("User can go out with friends for %d days\n", monthDays / 2);
    }

    static int getMonthDays (int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: return 31;
            case 4:
            case 6:
            case 9:
            case 11: return 30;
            case 2: return 28;
            default: return 0;
        }
    }
}

/*
Output:

Sum of Digits of Number

Enter Number: 1235
Sum of Digits of 1235 = 11

Enter Number: 312  
Sum of Digits of 312 = 6
*/