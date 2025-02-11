/**
 * 33. Search in Rotated Array
 * https://www.youtube.com/watch?v=W9QJ8HaRvJQ&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ
 * Category: Array, Binary Search
 */

import java.util.Arrays;

public class searchInRotatedArrayWithDuplicates {
    public static void main(String[] args) {
        System.out.println("Search in Rotated Array with Duplicates");

        int[] nums1 = { 4, 5, 6, 7, 7, 0, 0, 1, 2 };
        int[] nums2 = { 2,5,6,0,0,1,2 };

        System.out.println(Arrays.toString(nums1) + ", 0 = " + search(nums1, 0));
        System.out.println(Arrays.toString(nums1) + ", 3 = " + search(nums1, 3));
        System.out.println(Arrays.toString(nums2) + ", 0 = " + search(nums2, 0));
        System.out.println(Arrays.toString(nums2) + ", 3 = " + search(nums2, 3));
    }

    private static int search(int[] nums, int target) {
        int peak = findPeakIndexWithDuplicates(nums);

        // If Peak is -1, apply normal Binary Search Algorithm
        if (peak == -1)
            return binarySearch(nums, target, 0, nums.length - 1);

        // If peak element matches target, then return peak element's index
        if (peak == target)
            return peak;

        // If target greater than equal to 1st array element
        // then search only in the 1st part of array till peak's previous index
        if (target >= nums[0])
            return binarySearch(nums, target, 0, peak - 1);
        // If target is less than 1st array element
        // then search in the 2nd part of the array, starting from peak's next index
        // till last of array
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
            // If target is greater than mid element, update start pointer
            else
                return mid;
        }
        // Return -1 if not found
        return -1;
    }

    // Find Peak Index in the array with duplicate values
    private static int findPeakIndexWithDuplicates(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            // Calculate mid value
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

            // If elements & mid, start & end are duplicate, skip the duplicates
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                // Skip the duplicates
                // NOTE: What if the elements at start & end were the pivots?
                // Check if start is pivot
                if (nums[start] > nums[start + 1])
                    return start;
                start++;

                // Check if end is pivot
                if (nums[end] < nums[end - 1])
                    return end;
                end--;
            }
            // Left side is sorted, so pivot should be in the right side
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end]))
                // Check in right side, update start pointer
                start = mid + 1;
            // Check if left side, update end pointer
            else
                end = mid - 1;
        }
        return -1;
    }
}
