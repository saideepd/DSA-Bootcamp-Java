/**
 * 153. Find Minimum in Rotated Sorted Array
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 * Category: Array, Binary Search
 */

import java.util.Arrays;

public class findMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println("Find Minimum In Rotated Sorted Array");

        int[] nums1 = { 3, 4, 5, 1, 2 };
        int[] nums2 = { 4, 5, 6, 7, 0, 1, 2 };
        int[] nums3 = { 11, 13, 15, 17 };

        System.out.println(Arrays.toString(nums1) + " = " + findMin(nums1));
        System.out.println(Arrays.toString(nums2) + " = " + findMin(nums2));
        System.out.println(Arrays.toString(nums3) + " = " + findMin(nums3));
    }

    private static int findMin(int[] nums) {
        int pivot = findPivotWithDuplicates(nums);

        // Pivot is our point in array which points to the largetst value from array
        // Pivot + 1 will be the count of rotations in array
        // as all elements prior to pivot have been placed there after rotations
        return nums[pivot + 1];
    }

    private static int findPivotWithDuplicates(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases

            // Check if mid element is greater than next element of mid
            // meaning that the next part is ascending sorted & all elements < mid
            // Also, make sure that we don't go out of array index range
            // by checking if mid < end index
            if (mid < end && nums[mid] > nums[mid + 1])
                return mid;

            // If mid element is less than previous element of mid
            // meaning that we're currently in ascending part of array
            // and the previous element is the peak / max of array
            // Also, make sure that we don't go out of array index
            // by checking if mid > start
            if (mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;

            // If mid element is less than or equal to start element
            // it means that all the elements after mid are less than start
            // So, update the end pointer to be previous of mid & ignore elements after mid
            if (nums[mid] <= nums[start])
                end = mid - 1;
            // If mid element is greater than start element
            // it means that there could be some elements which are greater than mid towards its right
            // So, update the start pointer to be next of mid elememt & ignore elements before mid
            else
                start = mid + 1;
        }

        return -1;
    }
}

/**
 * Output:
 * 
 * Find Minimum In Rotated Sorted Array
 * [3, 4, 5, 1, 2] = 1
 * [4, 5, 6, 7, 0, 1, 2] = 0
 * [11, 13, 15, 17] = 11
 */