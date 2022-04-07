/**
 * 349. Intersection of Two Arrays
 * https://leetcode.com/problems/intersection-of-two-arrays/
 * Category: Array, Hash Table, Two Pointers, Binary Search, Sorting
 */

import java.util.Arrays;
import java.util.HashSet;

public class intersectionOfTwoArrays {
    public static void main(String[] args) {
        System.out.println("Intersection of Two Arrays");

        int[] nums11 = { 1, 2, 2, 1 };
        int[] nums12 = { 2, 2 };

        int[] nums21 = { 4, 9, 5 };
        int[] nums22 = { 9, 4, 9, 8, 4 };

        int[] nums31 = { 2, 1 };
        int[] nums32 = { 1, 1 };

        System.out.println(Arrays.toString(nums11) + ", " + Arrays.toString(nums12) + " = " + Arrays.toString(intersection(nums11, nums12)));
        System.out.println(Arrays.toString(nums21) + ", " + Arrays.toString(nums22) + " = " + Arrays.toString(intersection(nums21, nums22)));
        System.out.println(Arrays.toString(nums31) + ", " + Arrays.toString(nums32) + " = " + Arrays.toString(intersection(nums31, nums32)));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> intersection = new HashSet<>();

        // Sort the 1st array nums1 for performing binarySearch
        Arrays.sort(nums1);

        // Loop through the 2nd array nums2
        // and add them to intersection Set
        // by searching using Binary Search if the num is present in nums1 array
        for (int num : nums2) {
            if (binarySearch(nums1, num))
                intersection.add(num);
        }

        // Loop through the intersection Set & add them to result array
        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) {
            result[i++] = num;
        }

        return result;
    }

    // Regular Binary Search
    private static boolean binarySearch(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid])
                return true;
            else if (target < nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }
}

/**
 * Output:
 * 
 * Intersection of Two Arrays
 * [1, 2, 2, 1], [2, 2] = [2]
 * [4, 9, 5], [9, 4, 9, 8, 4] = [4, 9]
 * [2, 1], [1, 1] = [1]
 */