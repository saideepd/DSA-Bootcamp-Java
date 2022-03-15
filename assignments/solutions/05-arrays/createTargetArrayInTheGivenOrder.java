/**
 * 1389. Create Target Array in the Give Order
 * https://leetcode.com/problems/create-target-array-in-the-given-order/
 * Category: Array, Simulation
 */

import java.util.*;

public class createTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        System.out.println("Create Target Array in the Given Order");

        int[] nums1 = { 0, 1, 2, 3, 4 };
        int[] index1 = { 0, 1, 2, 2, 1 };
        System.out.println("[0,1,2,3,4], [0,1,2,2,1] = " + Arrays.toString(createTargetArray(nums1, index1)));

        int[] nums2 = { 1, 2, 3, 4, 0 };
        int[] index2 = { 0, 1, 2, 3, 0 };
        System.out.println("[1,2,3,4,0], [0,1,2,3,0] = " + Arrays.toString(createTargetArray(nums2, index2)));

        int[] nums3 = { 1 };
        int[] index3 = { 0 };
        System.out.println("[1], [0] = " + Arrays.toString(createTargetArray(nums3, index3)));
    }

    private static int[] createTargetArray(int[] nums, int[] index) {
        if (nums.length == 1)
            return nums;

        ArrayList<Integer> targetList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }

        int[] target = new int[targetList.size()];
        for (int i = 0; i < targetList.size(); i++) {
            target[i] = targetList.get(i);
        }

        return target;
    }
}

/**
 * Output:
 * 
 * Create Target Array in the Given Order
 * [0,1,2,3,4], [0,1,2,2,1] = [0, 4, 1, 3, 2]
 * [1,2,3,4,0], [0,1,2,3,0] = [0, 1, 2, 3, 4]
 * [1], [0] = [1]
 */