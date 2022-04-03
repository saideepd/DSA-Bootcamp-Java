/**
 * 367. Valid Perfect Square
 * https://leetcode.com/problems/valid-perfect-square/
 * Category: Math, Binary Search
 */

public class validPerfectSquare {
    public static void main(String[] args) {
        System.out.println("Valid Perfect Square");

        System.out.println("16 = " + isPerfectSquare(16));
        System.out.println("14 = " + isPerfectSquare(14));
    }

    private static boolean isPerfectSquare(int x) {
        if (x <= 1)
            return true;
        else {
            double sqrt = x / 2;
            double temp = 0;

            while (sqrt != temp) {
                temp = sqrt;

                sqrt = ((x / temp) + temp) / 2;
            }

            return (int) sqrt == sqrt;
        }
    }
}

/**
 * Output:
 * 
 * Valid Perfect Square
 * 16 = true
 * 14 = false
 */