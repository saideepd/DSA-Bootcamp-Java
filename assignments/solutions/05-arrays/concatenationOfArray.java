/**
 * 1929. Concatenation of Array
 * https://leetcode.com/problems/concatenation-of-array/
 */

import java.util.Arrays;

public class concatenationOfArray {
    public static void main(String[] arg) {
        System.out.println("Concatenation of Array");
        int[] nums1 = {1,2,1};
        int[] ans1 = getConcatenation(nums1);
        int[] nums2 = {1,3,2,1};
        int[] ans2 = getConcatenation(nums2);
        System.out.println("[1,2,1]: " + Arrays.toString(ans1));
        System.out.println("[1,3,2,1]: " + Arrays.toString(ans2));
    }

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = nums[i];
        }
        return ans;
    }
}

/**
 * Output:
 * 
 * Concatenation of Array
 * [1,2,1]: [1, 2, 1, 1, 2, 1]
 * [1,3,2,1]: [1, 3, 2, 1, 1, 3, 2, 1]
 */