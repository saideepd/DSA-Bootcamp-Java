import java.util.Scanner;

public class pythagoreanTriplet {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Check if given triplet is Pythagorean Triplet");
        System.out.print("\nEnter number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scan.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = scan.nextInt();
        System.out.println("\nGiven numbers " + (isPythagoreanTriplet(num1, num2, num3) ? "are" : "are not") + " Pythagorean Triplet");
    }

    private static boolean isPythagoreanTriplet(int a, int b, int c) {
        return a*a + b*b == c*c;
    }
}

/**
 * Output:
 * Check if given triplet is Pythagorean Triplet
 * 
 * Enter number 1: 6
 * Enter number 2: 8
 * Enter number 3: 10
 * 
 * Given numbers are Pythagorean Triplet
 * 
 * 
 * Enter number 1: 5
 * Enter number 2: 6
 * Enter number 3: 10
 * 
 * Given numbers are not Pythagorean Triplet
 */