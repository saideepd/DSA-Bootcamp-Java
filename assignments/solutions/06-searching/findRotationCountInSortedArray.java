/**
 * Find Rotation Count in Sorted Array
 * https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
 * Category: Array, Binary Search
 */

import java.util.Arrays;

public class findRotationCountInSortedArray {
    public static void main(String[] args) {
        System.out.println("Find Rotation Count in Sorted Array");

        int[] arr1 = { 15, 18, 2, 3, 6, 12 };
        int[] arr2 = { 7, 9, 11, 12, 5 };
        int[] arr3 = { 7, 9, 11, 12, 15 };
        int[] arr4 = { 4, 5, 6, 7, 0, 1, 2 };

        System.out.println(Arrays.toString(arr1) + " = " + findRotationCount(arr1));
        System.out.println(Arrays.toString(arr2) + " = " + findRotationCount(arr2));
        System.out.println(Arrays.toString(arr3) + " = " + findRotationCount(arr3));
        System.out.println(Arrays.toString(arr4) + " = " + findRotationCount(arr4));
    }

    private static int findRotationCount(int[] arr) {
        int pivot = findPivotWithDuplicates(arr);

        // Pivot is our point in array which points to the largetst value from array
        // Pivot + 1 will be the count of rotations in array
        // as all elements prior to pivot have been placed there after rotations
        return pivot + 1;

    }

    private static int findPivotWithDuplicates(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases

            // Check if mid element is greater than next element of mid
            // meaning that the next part is ascending sorted & all elements < mid
            // Also, make sure that we don't go out of array index range
            // by checking if mid < end index
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;

            // If mid element is less than previous element of mid
            // meaning that we're currently in ascending part of array
            // and the previous element is the peak / max of array
            // Also, make sure that we don't go out of array index
            // by checking if mid > start
            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;

            // If mid element is less than or equal to start element
            // it means that all the elements after mid are less than start
            // So, update the end pointer to be previous of mid & ignore elements after mid
            if (arr[mid] <= arr[start])
                end = mid - 1;
            // If mid element is greater than start element
            // it means that there could be some elements which are greater than mid towards its right
            // So, update the start pointer to be next of mid elememt & ignore elements before mid
            else
                start = mid + 1;
        }
        // Return -1 if not found
        return -1;
    }
}

/**
 * Output:
 * 
 * Find Rotation Count in Sorted Array
 * [15, 18, 2, 3, 6, 12] = 2
 * [7, 9, 11, 12, 5] = 4
 * [7, 9, 11, 12, 15] = 0
 * [4, 5, 6, 7, 0, 1, 2] = 4
 */