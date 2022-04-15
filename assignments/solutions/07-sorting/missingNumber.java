/**
 * 268. Missing Number
 * https://leetcode.com/problems/missing-number/
 * Category: Array, Hash Table, Math, Bit Manipulation, Sorting
 */

import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        System.out.println("Missing Number");

        int[] nums1 = {3,0,1};
        int[] nums2 = {0,1};
        int[] nums3 = {9,6,4,2,3,5,7,0,1};

        System.out.println(Arrays.toString(nums1) + " = " + missingNumber(nums1));
        System.out.println(Arrays.toString(nums2) + " = " + missingNumber(nums2));
        System.out.println(Arrays.toString(nums3) + " = " + missingNumber(nums3));
    }

    private static int missingNumber(int[] nums) {
        // Sum Approach
        int n = nums.length;
        int sum = (n * (n + 1) / 2);
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }
        return sum - arraySum;

        // Bubble Sort Approach
        // sort(nums);

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != i)
        //         return i;
        // }
        // return nums.length;
    }

    private static void sort(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length - 1; i++) {
            swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}

/**
 * Output:
 * 
 * Missing Number
 * [3, 0, 1] = 2
 * [0, 1] = 2
 * [9, 6, 4, 2, 3, 5, 7, 0, 1] = 8
 */