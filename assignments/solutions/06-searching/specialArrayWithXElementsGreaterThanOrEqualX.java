/**
 * 1608. Special Array with X Elements Greater than or Equal X
 * https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
 * Category: Array, Binary Search, Sorting
 */

import java.util.Arrays;

public class specialArrayWithXElementsGreaterThanOrEqualX {
    public static void main(String[] args) {
        System.out.println("Special Array with X Elements Greater than or Equal X");

        int[] nums1 = { 3, 5 };
        int[] nums2 = { 0, 0 };
        int[] nums3 = { 0, 4, 3, 0, 4 };

        System.out.println(Arrays.toString(nums1) + " = " + specialArray(nums1));
        System.out.println(Arrays.toString(nums2) + " = " + specialArray(nums2));
        System.out.println(Arrays.toString(nums3) + " = " + specialArray(nums3));
    }

    private static int specialArray(int[] nums) {
        if (nums.length == 0)
            return 0;

        Arrays.sort(nums);

        for (int x = 1; x <= nums.length; x++) {
            int target = nums.length - x;

            if (nums[target] >= x && (target == 0 || nums[target - 1] < x))
                return x;
        }

        return -1;
    }
}

/**
 * Output:
 * 
 * Special Array with X Elements Greater than or Equal X
 * [3, 5] = 2
 * [0, 0] = -1
 * [0, 4, 3, 0, 4] = 3
 */