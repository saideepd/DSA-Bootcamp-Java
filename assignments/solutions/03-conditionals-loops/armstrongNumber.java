// Armstrong Number

import java.util.Scanner;

public class armstrongNumber {
    public static void main (String args[]) {
        int num = 0, temp = 0, sum = 0, original = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Armstrong Number\n");
        System.out.print("Enter number: ");
        num = scan.nextInt();
        original = num;
        int power = getLength(num);
        while (num > 0) {
            temp = num % 10;
            num = num / 10;
            sum += Math.pow(temp, power);
        }
        if (sum == original)
            System.out.print(original + " is an Armstrong Number\n");
        else
            System.out.print(original + " is not an Armstrong Number\n");
    }

    static int getLength (int input) {
        int count = 0;
        while (input > 0) {
            input /= 10;
            count++;
        }
        return count;
    }
}

/*
Output:

Armstrong Number

Enter number: 153
153 is an Armstrong Number

Enter number: 234
234 is not an Armstrong Number
*/