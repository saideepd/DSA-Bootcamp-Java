/**
 * 34. Find First and Last Position of Element in Sorted Array
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * Category: Array, Binary Search
 */

import java.util.Arrays;

public class findFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        System.out.println("Find First and Last Position of Element in Sorted Array");

        int[] nums1 = { 5, 7, 7, 8, 8, 10 };
        int[] nums2 = {};
        int[] nums3 = { 5, 7, 7, 7, 7, 8, 8, 10 };

        System.out.println(Arrays.toString(nums1) + ", 8 = " + Arrays.toString(searchRange(nums1, 8)));
        System.out.println(Arrays.toString(nums1) + ", 6 = " + Arrays.toString(searchRange(nums1, 6)));
        System.out.println(Arrays.toString(nums2) + ", 0 = " + Arrays.toString(searchRange(nums2, 0)));
        System.out.println(Arrays.toString(nums3) + ", 7 = " + Arrays.toString(searchRange(nums3, 7)));
    }

    private static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };

        // Find first & last index value of target
        // And set the ans array
        ans[0] = binarySearch(nums, target, true);
        // Try finding last index only if start is not -1 which implies the target does not exist in array
        if (ans[0] != -1)
            ans[1] = binarySearch(nums, target, false);

        return ans;
    }

    private static int binarySearch(int[] nums, int target, boolean findStartIndex) {
        int start = 0, end = nums.length - 1, ans = -1;

        while (start <= end) {
            // Calculate mid value
            int mid = start + (end - start) / 2;

            // If target is less than mid element, update end pointer
            if (target < nums[mid])
                end = mid - 1;
            // If target is greater than mid element, update start pointer
            else if (target > nums[mid])
                start = mid + 1;
            // If mid element matches target value, set the ans to mid value
            else {
                ans = mid;
                // If we want to find the start index, update the end pointer
                if (findStartIndex)
                    end = mid - 1;
                // If we want to find the end index, update the start pointer
                else
                    start = mid + 1;
            }
        }
        return ans;
    }
}

/**
 * Output:
 * 
 * Find First and Last Position of Element in Sorted Array
 * [5, 7, 7, 8, 8, 10], 8 = [3, 4]
 * [5, 7, 7, 8, 8, 10], 6 = [-1, -1]
 * [], 0 = [-1, -1]
 * [5, 7, 7, 7, 7, 8, 8, 10], 7 = [1, 4]
 */