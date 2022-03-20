/**
 * 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 * Category: Array, HashTable
 */

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        System.out.println("Two Sum");

        int[] nums1 = { 2, 7, 11, 15 };
        int[] nums2 = { 3, 2, 4 };
        int[] nums3 = { 3, 3 };

        System.out.println(Arrays.toString(nums1) + ", 9 = " + Arrays.toString(getTwoSum(nums1, 9)));
        System.out.println(Arrays.toString(nums2) + ", 6 = " + Arrays.toString(getTwoSum(nums2, 6)));
        System.out.println(Arrays.toString(nums3) + ", 6 = " + Arrays.toString(getTwoSum(nums3, 6)));
    }

    private static int[] getTwoSum(int[] nums, int target) {
        // Create a HashMap to mark visited items
        HashMap<Integer, Integer> visited = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            // Check if visited HashMap contains the key for current item
            // If found, get the value from visited HashMap return visited position value
            if (visited.containsKey(current)) {
                return new int[] { visited.get(current), i };
            }

            // If not present in visited HashMap
            // then insert the difference of target & current element key
            // with value as current iterator
            else {
                visited.put((target - current), i);
            }
        }

        return null;
    }
}

/**
 * Output:
 * 
 * Two Sum
 * [2, 7, 11, 15], 9 = [0, 1]
 * [3, 2, 4], 6 = [1, 2]
 * [3, 3], 6 = [0, 1]
 */