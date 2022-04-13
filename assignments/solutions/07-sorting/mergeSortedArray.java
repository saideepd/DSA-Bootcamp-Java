/**
 * 88. Merge Sorted Array
 * https://leetcode.com/problems/merge-sorted-array/
 * Category: Array, Two Pointers, Sorting
 */

import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String[] args) {
        System.out.println("Merge Sorted Array");

        int[] nums11 = { 1, 2, 3, 0, 0, 0 };
        int[] nums12 = { 2, 5, 6 };

        System.out.println(Arrays.toString(nums11) + ", 3, " + Arrays.toString(nums12) + ", 3 = " + Arrays.toString(merge(nums11, 3, nums12, 3)));

        int[] nums21 = { 1 };
        int[] nums22 = { };

        System.out.println(Arrays.toString(nums21) + ", 1, " + Arrays.toString(nums22) + ", 0 = " + Arrays.toString(merge(nums21, 1, nums22, 0)));

        int[] nums31 = { 0 };
        int[] nums32 = { 1 };

        System.out.println(Arrays.toString(nums31) + ", 0, " + Arrays.toString(nums32) + ", 1 = " + Arrays.toString(merge(nums31, 0, nums32, 1)));
    }

    private static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointers p1 & p2 point to end of nums1 & nums
        int p1 = m - 1, p2 = n - 1, i = m + n - 1;

        // Iterate only till length of nums2
        while (p2 >= 0) {
            // While the length of nums1 is greater than 0
            // And the element at p1 in nums is greater then element at p2 in nums2
            // set the element in nums1 at ith position (from back) whichever is larger
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--];
            }
            // Else set the element in nums1 at ith position (from back) whichever is smaller
            else {
                nums1[i--] = nums2[p2--];
            }
        }

        return nums1;
    }
}

/**
 * Output:
 * 
 * Merge Sorted Array
 * [1, 2, 3, 0, 0, 0], 3, [2, 5, 6], 3 = [1, 2, 2, 3, 5, 6]
 * [1], 1, [], 0 = [1]
 * [0], 0, [1], 1 = [1]
 */