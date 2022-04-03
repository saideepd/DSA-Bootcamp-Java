/**
 * 1539. Kth Missing Positive Number
 * https://leetcode.com/problems/kth-missing-positive-number/
 * Category: Array, Binary Search
 */

import java.util.Arrays;

public class KthMissingPositiveNumbers {
    public static void main(String[] args) {
        System.out.println("Kth Missing Positive Number");

        int[] arr1 = { 2,3,4,7,11 };
        int[] arr2 = { 1,2,3,4 };
        
        System.out.println(Arrays.toString(arr1) + ", 5 = " + findKthPositive(arr1, 5));
        System.out.println(Arrays.toString(arr2) + ", 2 = " + findKthPositive(arr2, 2));
    }

    private static int findKthPositive(int[] arr, int k) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] - mid <= k)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start + k;
    }
}

/**
 * Output:
 * 
 * Kth Missing Positive Number
 * [2, 3, 4, 7, 11], 5 = 9
 * [1, 2, 3, 4], 2 = 6
 */