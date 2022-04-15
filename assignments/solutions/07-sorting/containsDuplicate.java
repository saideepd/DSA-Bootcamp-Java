/**
 * 217. Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 * Category: Array, Hash Table, Sorting
 */
import java.util.Arrays;
import java.util.HashMap;

public class containsDuplicate {
    public static void main(String[] args) {
        System.out.println("Contains Duplicate");

        int[] nums1 = { 1, 2, 3, 1 };
        int[] nums2 = { 1, 2, 3, 4 };
        int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        System.out.println(Arrays.toString(nums1) + " = " + containsDuplicate(nums1));
        System.out.println(Arrays.toString(nums2) + " = " + containsDuplicate(nums2));
        System.out.println(Arrays.toString(nums3) + " = " + containsDuplicate(nums3));
    }

    private static boolean containsDuplicate(int[] nums) {
        // HashMap Approach
        return hash(nums);

        // Bubble Sort Approach
        // sort(nums);
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] == nums[i - 1])
        //         return true;
        // }
        // return false;
    }

    // HashMap Approach
    private static boolean hash(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        // If hashMap contains num, we found duplicate element
        // Return True
        for (int num : nums) {
            if (hashMap.containsKey(num))
                return true;
            // Else add the element to hashMap
            else
                hashMap.put(num, 1);
        }
        return false;        
    }

    // Bubble Sort Approach
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
 * Contains Duplicate
 * [1, 2, 3, 1] = true
 * [1, 2, 3, 4] = false
 * [1, 1, 1, 3, 3, 4, 3, 2, 4, 2] = true
 */