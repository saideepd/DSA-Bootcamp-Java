// Greeting User

import java.util.Scanner;

public class greetingUser {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Greeting User\n");
        System.out.print("Enter your name: ");
        String input = scan.nextLine();
        System.out.println("Hello, " + input + "!");
    }
}

/*
Output;

Greeting User

Enter your name: Saideep
Hello, Saideep!
*/