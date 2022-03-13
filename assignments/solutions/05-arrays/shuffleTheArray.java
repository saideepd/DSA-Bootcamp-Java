/**
 * 1470. Shuffle the Array
 * https://leetcode.com/problems/shuffle-the-array/
 * Category: Array
 */

import java.util.Arrays;

public class shuffleTheArray {
    public static void main(String[] args) {
        System.out.println("Shuffle the Array");
        int[] nums1 = { 2, 5, 1, 3, 4, 7 };
        int n1 = 3;
        System.out.println("[2,5,1,3,4,7], 3 : " + Arrays.toString(shuffle(nums1, n1)));
        int[] nums2 = { 1, 2, 3, 4, 4, 3, 2, 1 };
        int n2 = 4;
        System.out.println("[1,2,3,4,4,3,2,1], 4 : " + Arrays.toString(shuffle(nums2, n2)));
        int[] nums3 = { 1, 1, 2, 2 };
        int n3 = 2;
        System.out.println("[1,1,2,2], 2 : " + Arrays.toString(shuffle(nums3, n3)));
    }

    private static int[] shuffle(int[] nums, int n) {
        int[] shuffledArray = new int[2 * n];
        for (int i = 0, k = 0; i < n; i++, k += 2) {
            shuffledArray[k] = nums[i];
            shuffledArray[k + 1] = nums[i + n];
        }
        return shuffledArray;
    }
}

/**
 * Output:
 * 
 * Shuffle the Array
 * [2,5,1,3,4,7], 3 : [2, 3, 5, 4, 1, 7]
 * [1,2,3,4,4,3,2,1], 4 : [1, 4, 2, 3, 3, 2, 4, 1]
 * [1,1,2,2], 2 : [1, 2, 1, 2]
 */