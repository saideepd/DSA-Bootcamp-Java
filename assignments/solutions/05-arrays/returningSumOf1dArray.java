/**
 * 1480. Returning Sum of 1d Array
 * https://leetcode.com/problems/running-sum-of-1d-array/
 * Category: Array, Prefix Sum
 */

import java.util.Arrays;

public class returningSumOf1dArray {
    public static void main(String[] args) {
        System.out.println("Returning Sum of 1d Array");
        int[] nums1 = { 1, 2, 3, 4 };
        System.out.println("[1,2,3,4]: " + Arrays.toString(runningSum(nums1)));
        int[] nums2 = { 1, 1, 1, 1, 1 };
        System.out.println("[1,1,1,1,1]: " + Arrays.toString(runningSum(nums2)));
    }

    private static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}

/**
 * Output:
 * 
 * Returning Sum of 1d Array
 * [1,2,3,4]: [1, 3, 6, 10]
 * [1,1,1,1,1]: [1, 2, 3, 4, 5]
 */