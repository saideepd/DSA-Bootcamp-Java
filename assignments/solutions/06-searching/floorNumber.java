/**
 * Find Floor Number
 * Find a number that is less than or equal to target element
 * https://www.youtube.com/watch?v=W9QJ8HaRvJQ&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=15
 */

import java.util.Arrays;

public class floorNumber {
    public static void main(String[] args) {
        System.out.println("Floor Number");

        int[] arr = { -10, -5, 1, 3, 7, 9, 12, 34 };

        System.out.println(Arrays.toString(arr) + ", 9 = " + floor(arr, 9));
        System.out.println(Arrays.toString(arr) + ", 5 = " + floor(arr, 5));
        System.out.println(Arrays.toString(arr) + ", 22 = " + floor(arr, 22));
        System.out.println(Arrays.toString(arr) + ", 51 = " + floor(arr, 51));
    }

    private static int floor(int[] arr, int target) {
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
        // Instead of returning -1, return end pointer
        // as end pointer will be the closest number less than or equal to target
        return end;
    }
}

/**
 * Floor Number
 * [-10, -5, 1, 3, 7, 9, 12, 34], 9 = 5
 * [-10, -5, 1, 3, 7, 9, 12, 34], 5 = 3
 * [-10, -5, 1, 3, 7, 9, 12, 34], 22 = 6
 * [-10, -5, 1, 3, 7, 9, 12, 34], 51 = 7
 */