// Vowel & Consonant Checker

import java.util.Scanner;

public class vowelConsonant {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vowel Consonant Checker\n");
        System.out.print("Enter character: ");
        char input = scan.next().charAt(0);
        if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' ||
            input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U')
            System.out.println(input + " is a Vowel");
        else
            System.out.println(input + " is a Consonant");
    }
}

/*
Output:

Vowel Consonant Checker

Enter character: d
d is a Consonant

Enter character: A
A is a Vowel

Enter character: a
a is a Vowel

Enter character: M
M is a Consonant
*/