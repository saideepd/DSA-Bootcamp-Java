/**
 * 69. Square Root (x)
 * https://leetcode.com/problems/sqrtx/
 * Category: Math, Binary Search
 * 
 * The main problem is to solve the problem 
 * without using the built-in functions
 */

public class squareRootX {
    public static void main(String[] args) {
        System.out.println("Square Root X");

        System.out.println("4 = " + mySqrt(4));
        System.out.println("3 = " + mySqrt(3));
        System.out.println("8 = " + mySqrt(8));
    }

    private static int mySqrt (int x) {
        if (x <= 1)
            return x;
        else {
            double sqrt = x / 2;
            double temp = 0;

            while (sqrt != temp) {
                temp = sqrt;

                sqrt = ((x / temp) + temp) / 2;
            }

            return (int)sqrt;
        }
    }
}

/**
 * Output:
 * 
 * Square Root X
 * 4 = 2
 * 3 = 1
 * 8 = 2
 */