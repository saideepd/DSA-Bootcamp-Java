/**
 * 169. Majority Element
 * https://leetcode.com/problems/majority-element/
 * Category: Array, Hash Table, Divide and Conquer, Sorting, Counting
 */

import java.util.Arrays;
import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {
        System.out.println("Majority Element");

        int[] nums1 = { 3, 2, 3 };
        int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };
        int[] nums3 = { 2, 2, 1, 1, 1, 2 };

        System.out.println(Arrays.toString(nums1) + " = " + majority(nums1));
        System.out.println(Arrays.toString(nums2) + " = " + majority(nums2));
        System.out.println(Arrays.toString(nums3) + " = " + majority(nums3));
    }

    private static int majority(int[] nums) {
        // Bubble Sort Approach
        sort(nums);
        return nums[nums.length / 2];

        // HashMap Approach
        // HashMap<Integer, Integer> hashMap = new HashMap<>();
        // for (int num : nums) {
        //     if (hashMap.containsKey(num))
        //         hashMap.put(num, hashMap.get(num) + 1);
        //     else
        //         hashMap.put(num, 1);
            
        //     if (hashMap.get(num) > nums.length / 2)
        //         return num;
        // }

        // System.out.println("There is no majority element");
        // return 0;

    }

    private static int[] sort(int[] nums) {
        boolean swapped;
        // Run the steps n - 1 times
        for (int i = 0; i < nums.length - 1; i++) {
            swapped = false;
            // For each step, max item will be placed at the last respective index
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] > nums[j - 1]) {
                    // Swap
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }

            // If any value swap is not swapped for a particular value of i
            // it means the array is sorted & hence stop the loop
            if (!swapped)
                break;
        }

        return nums;
    }
}

/**
 * Output:
 * 
 * Majority Element
 * [3, 2, 3] = 3
 * [2, 2, 1, 1, 1, 2, 2] = 2
 * [2, 2, 1, 1, 1, 2] = 1
 */