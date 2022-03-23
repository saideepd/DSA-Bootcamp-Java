/**
 * 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Category: Array, Two Pointers
 */

import java.util.Arrays;

public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        System.out.println("Remove Duplicates from Sorted Array");

        int[] nums1 = { 1, 1, 2 };
        int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] nums3 = { 1, 2, 3, 4 };
        int[] nums4 = { 1, 2, 2, 4 };

        System.out.println(Arrays.toString(nums1) + " = " + removeDuplicates(nums1));
        System.out.println(Arrays.toString(nums2) + " = " + removeDuplicates(nums2));
        System.out.println(Arrays.toString(nums3) + " = " + removeDuplicates(nums3));
        System.out.println(Arrays.toString(nums4) + " = " + removeDuplicates(nums4));
    }

    private static int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i])
                index++;
            nums[index] = nums[i];
        }
        return index + 1;
    }
}

/**
 * Output:
 * 
 * Remove Duplicates from Sorted Array
 * [1, 1, 2] = 2
 * [0, 0, 1, 1, 1, 2, 2, 3, 3, 4] = 5
 * [1, 2, 3, 4] = 4
 * [1, 2, 2, 4] = 3
 */