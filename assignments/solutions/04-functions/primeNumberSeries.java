
import java.util.Scanner;

public class primeNumberSeries {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Prime Number Series");
        System.out.print("\nEnter start number: ");
        int start = scan.nextInt();
        System.out.print("Enter end number: ");
        int end = scan.nextInt();

        if (start > end)
            System.out.println("Please enter End number larger than Start number");
        else if (end <= 1) {
            System.out.println(end + " is neither Prime nor Composite Number");
        }
        else {
            System.out.println("Prime Number Series: ");

            for (int i = start; i <= end; i++) {
                if (isPrime(i))
                    System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/**
 * Output:
 * 
 * Prime Number Series
 * 
 * Enter start number: 0
 * Enter end number: 1
 * 1 is neither Prime nor Composite Number
 * 
 * Enter start number: 10
 * Enter end number: 30
 * Prime Number Series: 
 * 11
 * 13
 * 17
 * 19
 * 23
 * 29
 */