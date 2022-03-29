/**
 * Binary Search Algorithm
 * https://www.youtube.com/watch?v=f6UU7V3szVw&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=14
 * In Order Agnoistic Binary Search, we don't know whether the array is sorted in Ascending or Descending Order
 * We find the sorting order & apply logic based on the outcome
 */

import java.util.Arrays;

public class orderAgnoisticBinarySearchAlgorithm {
    public static void main(String[] args) {
        System.out.println("Order Agnoistic Binary Search Algorithm");

        int[] arr1 = {-10, -5, 1, 3, 7, 9, 12, 34};
        int[] arr2 = {28, 20, 16, 11, 9, 5, 2, 0, -3, -7};

        System.out.println(Arrays.toString(arr1) + ", 9 = " + orderAgnoisticBinarySearch(arr1, 9));
        System.out.println(Arrays.toString(arr1) + ", 34 = " + orderAgnoisticBinarySearch(arr1, 34));
        System.out.println(Arrays.toString(arr2) + ", -3 = " + orderAgnoisticBinarySearch(arr2, -3));
        System.out.println(Arrays.toString(arr2) + ", 20 = " + orderAgnoisticBinarySearch(arr2, 20));
    }

    private static int orderAgnoisticBinarySearch (int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        // Find whether the array is in Ascending or Descending Order
        boolean isAcending = arr[start] < arr[end];

        while (start <= end) {
            // Calculate middle value
            int mid = start + (end - start) / 2;
            // Return mid value if mid is the target value
            if (target == arr[mid])
                return mid;

            // Select the logic based on array sorting order
            if (isAcending) {
                // Update end value if target is less than calculated mid
                if (target < arr[mid])
                    end = mid - 1;
                // Update start value if target is greater than calculated mid
                else
                    start = mid + 1;
            }
            else {
                // Update end value if target is greater than calculated mid
                if (target > arr[mid])
                    end = mid - 1;
                // Update start value if target is less than calculated mid
                else
                    start = mid + 1;
            }
        }
        // Return -1 if target does not exist
        return -1;
    }
}

/**
 * Output:
 * 
 * Order Agnoistic Binary Search Algorithm
 * [-10, -5, 1, 3, 7, 9, 12, 34], 9 = 5
 * [-10, -5, 1, 3, 7, 9, 12, 34], 34 = 7
 * [28, 20, 16, 11, 9, 5, 2, 0, -3, -7], -3 = 8
 * [28, 20, 16, 11, 9, 5, 2, 0, -3, -7], 20 = 1
 */