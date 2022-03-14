/**
 * 1365. How Many Numbers Are Smaller Than the Current Number
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 * Category: Array, Hash Table, Sorting
 */

import java.util.Arrays;

public class howManyNumbersAreSmallerThanCurrentNumber {
    public static void main(String[] args) {
        System.out.println("How Many Numbers are Smaller than the Current Number");

        int[] nums1 = { 8, 1, 2, 2, 3 };
        System.out.println("[8,1,2,2,3]: " + Arrays.toString(smallerNumbersThanCurrent(nums1)));
        int[] nums2 = { 6, 5, 4, 8 };
        System.out.println("[6,5,4,8]: " + Arrays.toString(smallerNumbersThanCurrent(nums2)));
        int[] nums3 = { 7, 7, 7, 7 };
        System.out.println("[7,7,7,7]: " + Arrays.toString(smallerNumbersThanCurrent(nums3)));
    }

    private static int[] smallerNumbersThanCurrent(int[] nums) {
        // Iterative Approach
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] < nums[i])
                    count++;
            }
            result[i] = count;
        }
        return result;
    }
}

/**
 * Output:
 * 
 * How Many Numbers are Smaller than the Current Number
 * [8,1,2,2,3]: [4, 0, 1, 1, 3]
 * [6,5,4,8]: [2, 1, 0, 3]
 * [7,7,7,7]: [0, 0, 0, 0]
 */