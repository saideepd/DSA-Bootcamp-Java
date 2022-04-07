/**
 * 349. Intersection of Two Arrays
 * https://leetcode.com/problems/intersection-of-two-arrays/
 * Category: Array, Hash Table, Two Pointers, Binary Search, Sorting
 */

import java.util.ArrayList;
import java.util.Arrays;

public class intersectionOfTwoArrays2 {
    public static void main(String[] args) {
        System.out.println("Intersection of Two Arrays 2");

        int[] nums11 = { 1, 2, 2, 1 };
        int[] nums12 = { 2, 2 };

        int[] nums21 = { 4, 9, 5 };
        int[] nums22 = { 9, 4, 9, 8, 4 };

        System.out.println(Arrays.toString(nums11) + ", " + Arrays.toString(nums12) + " = " + Arrays.toString(intersect(nums11, nums12)));
        System.out.println(Arrays.toString(nums21) + ", " + Arrays.toString(nums22) + " = " + Arrays.toString(intersect(nums21, nums22)));
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        // Sort both the arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> resultList = new ArrayList<>();
        int i = 0, j = 0;

        // Use 2 pointers i & j to track nums1 & nums2 array
        while (i < nums1.length && j < nums2.length) {
            // If elements in both nums1 & nums2 at given position match
            // then push the nums1 element in result array
            // and increment both the pointers
            if (nums1[i] == nums2[j]) {
                resultList.add(nums1[i]);
                i++;
                j++;
            }
            // If element of nums1 array is less than element of nums2 array
            // increment pointer of nums1 i.e. i
            else if (nums1[i] < nums2[j])
                i++;
            // If element of nums1 array is greater than element of nums2 array
            // increment pointer of nums2 i.e. j
            else
                j++;
        }

        // Iterate through the ArrayList & store and return the result in array
        int[] result = new int[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            result[k] = resultList.get(k);
        }

        return result;
    }
}

/**
 * Output:
 * 
 * Intersection of Two Arrays 2
 * [1, 2, 2, 1], [2, 2] = [2, 2]
 * [4, 9, 5], [9, 4, 9, 8, 4] = [4, 9]
 */