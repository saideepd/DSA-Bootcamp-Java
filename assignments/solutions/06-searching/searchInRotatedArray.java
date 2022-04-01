/**
 * 33. Search in Rotated Array
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 * Category: Array, Binary Search
 */

import java.util.Arrays;

public class searchInRotatedArray {
    public static void main(String[] args) {
        System.out.println("Search in Rotated Array");

        int[] nums1 = { 4, 5, 6, 7, 0, 1, 2 };
        int[] nums2 = { 1 };

        System.out.println(Arrays.toString(nums1) + " = " + search(nums1, 0));
        System.out.println(Arrays.toString(nums1) + " = " + search(nums1, 3));
        System.out.println(Arrays.toString(nums2) + " = " + search(nums2, 0));
    }

    private static int search(int[] nums, int target) {
        int peak = findPeakIndex(nums);

        // If Peak is -1, apply normal Binary Search algorithm
        if (peak == -1)
            return binarySearch(nums, target, 0, nums.length - 1);

        // If peak element matches target, then return peak element's index
        if (nums[peak] == target)
            return peak;

        // If target greater than equal to 1st array element
        // then search only in the 1st part of array till peak's previous index
        if (target >= nums[0])
            return binarySearch(nums, target, 0, peak - 1);
        // If target is less than 1st array element
        // then search in the 2nd part of the array, starting from peak's next index till last of array
        else
            return binarySearch(nums, target, peak + 1, nums.length - 1);
    }

    // Apply Binary Search to find target element in given array
    private static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            // Calculate mid value
            int mid = start + (end - start) / 2;

            // If target is less than mid element, update end pointer
            if (target < nums[mid])
                end = mid - 1;
            // If target is greater than mid element, update start pointer
            else if (target > nums[mid])
                start = mid + 1;
            // If mid element matches target, return mid index
            else
                return mid;
        }
        // Return -1 if not found
        return -1;
    }

    // Find Peak Index in the array
    private static int findPeakIndex(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            // Calculate mid value
            int mid = start + (end - start) / 2;

            // 4 cases

            // Check if mid element is greater than next element of mid
            // meaning that the next part is ascending sorte & all elements < mid
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
        // Return -1 if not found
        return -1;
    }
}

/**
 * Output:
 * 
 * Search in Rotated Array
 * [4, 5, 6, 7, 0, 1, 2] = 4
 * [4, 5, 6, 7, 0, 1, 2] = -1
 * [1] = -1
 */