/**
 * 1920. Build Array from Permutation
 * https://leetcode.com/problems/build-array-from-permutation/
 */

public class buildArrayFromPermutation {
    public static void main(String[] args) {
        System.out.println("Build Array from Permutation");
        int[] nums1 = { 0, 2, 1, 5, 3, 4 };
        int[] ans1 = buildArray(nums1);
        System.out.print("[0,2,1,5,3,4] : " + buildArray(nums1));
        for (int i : ans1) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[] nums2 = { 5, 0, 1, 2, 3, 4 };
        int[] ans2 = buildArray(nums2);
        System.out.print("[5,0,1,2,3,4] : ");
        for (int i : ans2) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}

/**
 * Output:
 * 
 * Build Array from Permutation
 * [0,2,1,5,3,4] : 0 1 2 4 5 3
 * [5,0,1,2,3,4] : 4 5 0 1 2 3
 */