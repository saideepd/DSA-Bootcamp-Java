// Check whether Number from input is Prime or not

import java.util.Scanner;
public class primeNumber {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Find Number is Prime or not");
        System.out.print("\nEnter number: ");
        int num = scan.nextInt();
        isPrime(num);
    }

    static void isPrime(int num) {
        if (num <= 1) {
            System.out.println(num + " is neither Prime nor Composite Number");
            return;
        }
        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                System.out.println(num + " is not a Prime Number");
                return;
            }
            c = c + 1;
        }
        if (c * c > num) {
            System.out.println(num + " is a Prime Number");
        }
    }
}

/*
Output:

Find Number is Prime or not

Enter number: 5
5 is a Prime Number

Enter number: 6
6 is not a Prime Number

Enter number: 1
1 is neither Prime nor Composite Number
*/