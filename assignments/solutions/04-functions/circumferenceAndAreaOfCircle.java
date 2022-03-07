// Find Circumference & Area of Circle from input

import java.util.Scanner;
public class circumferenceAndAreaOfCircle {
    private static double pi = 3.14;
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Circumference & Area of Circle");
        System.out.print("\nEnter radius of Circle: ");
        int radius = scan.nextInt();

        System.out.printf("\nCircumference of Circle = %.2f", circumference(radius));
        System.out.printf("\nArea of Circle = %.2f\n", area(radius));
    }

    static double circumference(int r) {
        return 2 * pi * r;
    }

    static double area(int r) {
        return pi * r * r;
    }
}

/*
Output:

Circumference & Area of Circle

Enter radius of Circle: 5

Circumference of Circle = 31.40
Area of Circle = 78.50
*/