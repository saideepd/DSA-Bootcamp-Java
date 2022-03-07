// Find if the number is Palindrome or not

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Check whether number is Palindrome");
        System.out.print("\nEnter number: ");
        int number = scan.nextInt();
        System.out.println(number + " is " + (isPalindrome(number) ? "Palindrome Number" : "not Palindrome Number"));
    }

    private static boolean isPalindrome(int number) {
        int original = number;
        int temp = 0, sum = 0;
        while (number > 0) {
            temp = number % 10;
            number = number / 10;
            sum = (sum * 10) + temp;
        }
        System.out.println(sum);
        return original == sum;
    }
}

/**
 * Output:
 * 
 * Check whether number is Palindrome
 * 
 * Enter number: 121
 * 121
 * 121 is not Palindrome Number
 * 
 * Enter number: 33243  
 * 34233
 * 33243 is not Palindrome Number
 */