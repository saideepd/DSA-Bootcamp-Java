/**
 * 81. Search in Rotated Array 2
 * https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
 * Category: Array, Binary Search
 */

 import java.util.Arrays;

public class searchInRotatedArray2 {
    public static void main(String[] args) {
        System.out.println("Search in Rotated Array 2");

        int[] nums1 = { 2, 5, 6, 0, 0, 1, 2 };
        int[] nums2 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 13, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int[] nums3 = { 1 };

        System.out.println(Arrays.toString(nums1) + ", 0 = " + search(nums1, 0));
        System.out.println(Arrays.toString(nums1) + ", 3 = " + search(nums1, 3));
        System.out.println(Arrays.toString(nums2) + ", 13 = " + search(nums2, 13));
        System.out.println(Arrays.toString(nums3) + ", 0 = " + search(nums3, 0));
    }

    private static boolean search(int[] nums, int target) {
        // Return false for null or empty array
        if (nums == null || nums.length == 0)
            return false;

        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid])
                return true;

            // If start, mid & end elements are duplicates
            // Increment start pointer & decrement end pointer
            while (start < mid && nums[start] == nums[mid] && nums[end] == nums[mid]) {
                start++;
                end--;
            }

            // Check whether target lies if left side or right side
            if (nums[start] <= nums[mid]) {
                // Left side is sorted, right side is unsorted
                if (target >= nums[start] && target < nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                // Left side is unsorted, right side is sorted
                if (target > nums[mid] && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return false;
    }
}

/**
 * Output:
 * 
 * Search in Rotated Array 2
 * [2, 5, 6, 0, 0, 1, 2], 0 = true
 * [2, 5, 6, 0, 0, 1, 2], 3 = false
 * [1, 1, 1, 1, 1, 1, 1, 1, 1, 13, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1], 13 = true
 * [1], 0 = false
 */