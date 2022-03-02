// Reverse String

import java.util.Scanner;

public class reverseString {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Reverse String\n");
        System.out.print("Enter text: ");
        String text = scan.nextLine();
        String reverseString = "";
        for(int i = text.length() - 1; i >=0; i--) {
            reverseString += text.charAt(i);
        }
        System.out.printf("Reversed String: %s\n", reverseString);
    }
}

/*
Output:

Reverse String

Enter text: Hello, World!   
Reversed String: !dlroW ,olleH
*/