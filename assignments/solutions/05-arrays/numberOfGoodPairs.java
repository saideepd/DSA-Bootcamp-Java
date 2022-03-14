/**
 * 1512. Number of Good Pairs
 * https://leetcode.com/problems/number-of-good-pairs/
 * Category: Array, Hash Table, Map, Two Pointer
 */

public class numberOfGoodPairs {
    public static void main(String[] args) {
        System.out.println("Number of Good Pairs");
        int[] nums1 = { 1, 2, 3, 1, 1, 3 };
        System.out.println("[1,2,3,1,1,3]: " + numIdenticalPairs(nums1));
        int[] nums2 = { 1, 1, 1, 1 };
        System.out.println("[1,1,1,1]: " + numIdenticalPairs(nums2));
        int[] nums3 = { 1, 2, 3 };
        System.out.println("[1,2,3]: " + numIdenticalPairs(nums3));
    }

    private static int numIdenticalPairs(int[] nums) {
        // Iterative Approach
        // int count = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] == nums[j])
        //             count++;
        //     }
        // }
        // return count;

        // Two Pointer Approach
        int left = 0, right = nums.length - 1, count = 0;
        while (left < right) {
            if (nums[left] == nums[right])
                count++;
            right--;

            if (left == right) {
                left++;
                right = nums.length - 1;
            }
        }
        return count;
    }
}

/**
 * Output:
 * 
 * Number of Good Pairs
 * [1,2,3,1,1,3]: 4
 * [1,1,1,1]: 6
 * [1,2,3]: 0
 */