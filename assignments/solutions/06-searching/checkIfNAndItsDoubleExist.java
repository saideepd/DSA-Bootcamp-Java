/**
 * 1346. Check If N and its Double Exist
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/
 * Category: Array, Hash Table, Two Pointers, Binary Search, Sorting
 */

import java.util.Arrays;
import java.util.HashSet;

public class checkIfNAndItsDoubleExist {
    public static void main(String[] args) {
        System.out.println("Check if N and its Double Exist");

        int[] arr1 = { 10, 2, 5, 3 };
        int[] arr2 = { 7, 1, 14, 11 };
        int[] arr3 = { 3, 1, 7, 11 };

        System.out.println(Arrays.toString(arr1) + " = " + checkIfExist(arr1));
        System.out.println(Arrays.toString(arr2) + " = " + checkIfExist(arr2));
        System.out.println(Arrays.toString(arr3) + " = " + checkIfExist(arr3));
    }

    private static boolean checkIfExist(int[] arr) {
        HashSet<Integer> hash = new HashSet<Integer>();

        for (int num : arr) {
            // If hash contains 2 * num
            // Or hash contains num / 2 && the division is not a float (num % 2 == 0)
            // Return true as the double or half of num exists
            if (hash.contains(2 * num) || (num % 2 == 0 && hash.contains(num / 2)))
                return true;
            // Else add the num to hash
            else
                hash.add(num);
        }
        // Return false if no double or half exists
        return false;
    }
}

/**
 * Output:
 * 
 * Check if N and its Double Exist
 * [10, 2, 5, 3] = true
 * [7, 1, 14, 11] = true
 * [3, 1, 7, 11] = false
 */