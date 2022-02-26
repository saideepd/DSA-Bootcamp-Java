// Armstrong Number

import java.util.*;

public class armstrong {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Armstrong Number");
        System.out.print("Enter number: ");
        int input = scan.nextInt();
        int power = getLength(input);
        int result = 0, original = input;
        for(int i = 0; i < power; i++) {
            int temp = input % 10;
            result = result + (int)Math.pow(temp, power);
            input /= 10;
        }
        if (original == result)
            System.out.println(original + " is an Armstrong Number");
        else
            System.out.println(original + " is not an Armstrong Number");
    }

    static int getLength(int input) {
        int n = 0;
        while (input != 0) {
            n++;
            input /= 10;
        }
        return n;
    }
}

/*
Output:

Armstrong Number
Enter number: 324
324 is not an Armstrong Number

Armstrong Number
Enter number: 153
153 is an Armstrong Number
*/