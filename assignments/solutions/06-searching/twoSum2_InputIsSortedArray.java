/**
 * 167. Two Sum 2 - Input Array is Sorted
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * Category: Array, Two Pointers, Binary Search
 */

import java.util.Arrays;

public class twoSum2_InputIsSortedArray {
    public static void main(String[] args) {
        System.out.println("Two Sum 2 - Input is Sorted Array");

        int[] numbers1 = { 2, 7, 11, 15 };
        int[] numbers2 = { 2, 3, 4 };
        int[] numbers3 = { -1, 0 };

        System.out.println(Arrays.toString(numbers1) + ", 9 = " + Arrays.toString(twoSum(numbers1, 9)));
        System.out.println(Arrays.toString(numbers2) + ", 6 = " + Arrays.toString(twoSum(numbers2, 6)));
        System.out.println(Arrays.toString(numbers3) + ", -1 = " + Arrays.toString(twoSum(numbers3, -1)));
    }

    private static int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            // Calculate sum by summing start & end pointers
            int sum = numbers[start] + numbers[end];

            // If sum matches target, set the index values & break the loop
            if (sum == target) {
                indices[0] = start + 1;
                indices[1] = end + 1;
                break;
            }
            // If sum is greater than target, decrement end pointer
            else if (sum > target)
                end--;
            // If sum is less than target, increment start pointer
            else
                start++;
        }
        return indices;
    }
}

/**
 * Output:
 * 
 * Two Sum 2 - Input is Sorted Array
 * [2, 7, 11, 15], 9 = [1, 2]
 * [2, 3, 4], 6 = [1, 3]
 * [-1, 0], -1 = [1, 2]
 */