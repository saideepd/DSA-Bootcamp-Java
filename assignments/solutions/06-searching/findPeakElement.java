/**
 * 162. Find Peak Element
 * https://leetcode.com/problems/find-peak-element/
 * Category: Array, Binary Search
 */

import java.util.Arrays;

public class findPeakElement {
    public static void main(String[] args) {
        System.out.println("Find Peak Element");

        int[] nums1 = { 1, 2, 3, 1 };
        int[] nums2 = { 1, 2, 1, 3, 5, 6, 4 };

        System.out.println(Arrays.toString(nums1) + " = " + findPeakElement(nums1));
        System.out.println(Arrays.toString(nums2) + " = " + findPeakElement(nums2));
    }

    private static int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1;
        // Not having <= condition as we want to compare in 2 parts of array
        while (start < end) {
            // Calculate mid value
            int mid = start + (end - start) / 2;

            // If mid element > mid+1 element
            // It means you're in decreasing part of array
            // This could be the possible answer, but look to the left side of array
            // This is why end != mid - 1 like regular binary search
            if (nums[mid] > nums[mid + 1])
                end = mid;
            // If mid element < mid+1 element
            // It means you're in increasing part of array
            else
                start = mid + 1;
        }
        // In the end, start == end and pointing to the largest number because of the 2
        // checks above
        // start & end are always trying to find the largest number in above 2 checks
        // hence they are pointing to just one element, that is the max element because
        // that is what the checks do
        // Elaborated : At every point of start & end, they have the best possible
        // answer till that time
        // and if we're saying that only one items is remaining, hence because of above
        // line that is the best possible answer
        return start;
    }
}

/**
 * Output:
 * 
 * Find Peak Element
 * [1, 2, 3, 1] = 2
 * [1, 2, 1, 3, 5, 6, 4] = 5
 */