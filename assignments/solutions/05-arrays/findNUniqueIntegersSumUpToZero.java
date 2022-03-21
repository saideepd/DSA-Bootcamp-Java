/**
 * 1304. Find N Unique Integers Sum up to Zero
 * https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
 * Category: Array, Math
 */

import java.util.Arrays;

public class findNUniqueIntegersSumUpToZero {
    public static void main(String[] args) {
        System.out.println("Find N Unique Integers Sum up to Zero");

        System.out.println("5 = " + Arrays.toString(sumZero(5)));
        System.out.println("4 = " + Arrays.toString(sumZero(4)));
        System.out.println("3 = " + Arrays.toString(sumZero(3)));
        System.out.println("1 = " + Arrays.toString(sumZero(1)));
    }

    private static int[] sumZero (int n) {
        int[] result = new int[n];
        int i = 0, j = n - 1, value = 1;

        // Insert +ve & -ve values starting from 1
        // Start from left & right and increment & decrement each respectively
        while (i < j) {
            result[i++] = value;
            result[j--] = -value;
            value++;
        }

        // No Need to insert 0 for odd n as java by default fills all Arrays with 0

        return result;
    }
}

/**
 * Output:
 * 
 * Find N Unique Integers Sum up to Zero
 * 5 = [1, 2, 0, -2, -1]
 * 4 = [1, 2, -2, -1]
 * 3 = [1, 0, -1]
 * 1 = [0]
 */