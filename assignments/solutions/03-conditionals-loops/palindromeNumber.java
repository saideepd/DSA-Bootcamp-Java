// Palindrome Number

import java.util.Scanner;

public class palindromeNumber {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Palindrome Number\n");
        System.out.print("Enter number: ");
        String input = scan.nextLine();

        int length = input.length();
        boolean isPalindrome = true;
        for(int i = 0; i < length/2; i++) {
            if(input.charAt(i) != input.charAt(length - i -1))
                isPalindrome = false;
        }
        if (isPalindrome)
            System.out.printf("%s is Palindrome Number\n", input);
        else
            System.out.printf("%s is not Palindrome Number\n", input);
    }
}

/*
Output:

Palindrome Number

Enter number: 121
121 is Palindrome Number

Enter number: 1232
1232 is not Palindrome Number
*/