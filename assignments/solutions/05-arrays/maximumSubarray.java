/**
 * 53. Maximum Subarray
 * https://leetcode.com/problems/maximum-subarray/
 * Category: Array, Divide and Conquer, Dynamic Programming
 */

import java.util.Arrays;

public class maximumSubarray {
    public static void main(String[] args) {
        System.out.println("Maximum Subarray");

        int[] nums1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int[] nums2 = { 1 };
        int[] nums3 = { 5, 4, -1, 7, 8 };

        System.out.println(Arrays.toString(nums1) + " = " + maxSubArray(nums1));
        System.out.println(Arrays.toString(nums2) + " = " + maxSubArray(nums2));
        System.out.println(Arrays.toString(nums3) + " = " + maxSubArray(nums3));
    }

    private static int maxSubArray(int[] nums) {
        int currentMax = nums[0], maxGlobal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            if (currentMax > maxGlobal)
                maxGlobal = currentMax;
        }
        return maxGlobal;
    }
}

/**
 * Output:
 * 
 * Maximum Subarray
 * [-2, 1, -3, 4, -1, 2, 1, -5, 4] = 6
 * [1] = 1
 * [5, 4, -1, 7, 8] = 23
 */