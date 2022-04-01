/**
 * 704. Binary Search
 * https://leetcode.com/problems/binary-search/
 * Category: Array, Binary Search
 */

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        System.out.println("Binary Search");

        int[] nums = { -1, 0, 3, 5, 9, 12 };

        System.out.println(Arrays.toString(nums) + " = " + search(nums, 9));
        System.out.println(Arrays.toString(nums) + " = " + search(nums, 2));
    }

    private static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            // Calculate mid value
            int mid = start + (end - start) / 2;

            // If mid element matches target, return mid index
            if (target == nums[mid])
                return mid;
            // If target is less than mid element, update end pointer
            else if (target < nums[mid])
                end = mid - 1;
            // If target is greater than mid element, update start pointer
            else
                start = mid + 1;
        }

        // Return -1 if target does not exists in array
        return -1;
    }
}

/**
 * Output:
 * 
 * Binary Search
 * [-1, 0, 3, 5, 9, 12] = 4
 * [-1, 0, 3, 5, 9, 12] = -1
 */