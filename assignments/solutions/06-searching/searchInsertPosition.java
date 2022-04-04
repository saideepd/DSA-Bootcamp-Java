/**
 * 35. Search Insert Position
 * https://leetcode.com/problems/search-insert-position/
 * Category: Array, Binary Search
 */

import java.util.Arrays;

public class searchInsertPosition {
    public static void main(String[] args) {
        System.out.println("Search Insert Position");

        int[] nums = { 1, 3, 5, 6 };

        System.out.println(Arrays.toString(nums) + ", 5 = " + searchInsert(nums, 5));
        System.out.println(Arrays.toString(nums) + ", 2 = " + searchInsert(nums, 2));
        System.out.println(Arrays.toString(nums) + ", 7 = " + searchInsert(nums, 7));
    }

    private static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid])
                return mid;
            else if (target < nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }
}

/**
 * Output:
 * 
 * Search Insert Position
 * [1, 3, 5, 6], 5 = 2
 * [1, 3, 5, 6], 2 = 1
 * [1, 3, 5, 6], 7 = 4
 */