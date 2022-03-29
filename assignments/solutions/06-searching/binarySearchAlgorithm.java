/**
 * Binary Search Algorithm
 * https://www.youtube.com/watch?v=f6UU7V3szVw&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=14
 */

 import java.util.Arrays;

public class binarySearchAlgorithm {
    public static void main(String[] args) {
        System.out.println("Binary Search Algorithm");

        int[] arr = {-10, -5, 1, 3, 7, 9, 12, 34};

        System.out.println(Arrays.toString(arr) + ", 9 = " + binarySearch(arr, 9));
        System.out.println(Arrays.toString(arr) + ", -5 = " + binarySearch(arr, -5));
        System.out.println(Arrays.toString(arr) + ", 3 = " + binarySearch(arr, 3));
        System.out.println(Arrays.toString(arr) + ", 21 = " + binarySearch(arr, 21));
    }

    private static int binarySearch (int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            // Calculate middle value
            int mid = start + (end - start) / 2;
            // Update end value if target is less than calculated mid
            if (target < arr[mid])
                end = mid - 1;
            // Update start value if target is greater than calculated mid
            else if (target > arr[mid])
                start = mid + 1;
            // Return mid value if mid is the target value
            else
                return mid;
        }
        // Return -1 if target does not exist
        return -1;
    }
}

/**
 * Output:
 * 
 * Binary Search Algorithm
 * [-10, -5, 1, 3, 7, 9, 12, 34], 9 = 5
 * [-10, -5, 1, 3, 7, 9, 12, 34], -5 = 1
 * [-10, -5, 1, 3, 7, 9, 12, 34], 3 = 3
 * [-10, -5, 1, 3, 7, 9, 12, 34], 21 = -1
 */