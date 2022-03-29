/**
 * Find Ceiling Number
 * Find a number that is greater than or equal to target element
 * https://www.youtube.com/watch?v=W9QJ8HaRvJQ&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=15
 */

import java.util.Arrays;

public class ceilingNumber {
    public static void main(String[] args) {
        System.out.println("Ceiling Number");

        int[] arr = { -10, -5, 1, 3, 7, 9, 12, 34 };

        System.out.println(Arrays.toString(arr) + ", 9 = " + ceiling(arr, 9));
        System.out.println(Arrays.toString(arr) + ", 5 = " + ceiling(arr, 5));
        System.out.println(Arrays.toString(arr) + ", 22 = " + ceiling(arr, 22));
        System.out.println(Arrays.toString(arr) + ", 51 = " + ceiling(arr, 51));
    }

    private static int ceiling(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            // Calculate middle value
            int mid = start + (end - start) / 2;
            // Update end value if target is less than calculated mid
            if (target == arr[mid])
                return mid;
            // Update start value if target is greater than calculated mid
            else if (target < arr[mid])
                end = mid - 1;
            // Return mid value if mid is the target value
            else
                start = mid + 1;
        }
        // Instead of returning -1, return start pointer 
        // as start pointer will be the closest number greater than or equal to target
        return start;
    }
}

/**
 * Ceiling Number
 * [-10, -5, 1, 3, 7, 9, 12, 34], 9 = 5
 * [-10, -5, 1, 3, 7, 9, 12, 34], 5 = 4
 * [-10, -5, 1, 3, 7, 9, 12, 34], 22 = 7
 * [-10, -5, 1, 3, 7, 9, 12, 34], 51 = 8
 */