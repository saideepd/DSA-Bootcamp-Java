// Palindrome String

import java.util.*;

public class palindrome {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Palindrome String");
        System.out.print("Enter text: ");
        String input = scan.nextLine();
        String reverse = "";
        for(int i = input.length()-1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        if(input.toLowerCase().equals(reverse.toLowerCase()))
            System.out.println(input + " is palindrome");
        else
            System.out.println(input + " is not palindrome");
    }
}

/*
Output:

Palindrome String
Enter text: Hello
Hello is not palindrome

Palindrome String
Enter text: MadAm
MadAm is palindrome
*/