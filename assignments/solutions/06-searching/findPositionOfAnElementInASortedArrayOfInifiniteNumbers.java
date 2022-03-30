/**
 * Find Position of an Element in a Sorted Array of Inifinite Numbers
 * https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
 * Category: Array, Binary Search
 */

 import java.util.Arrays;

public class findPositionOfAnElementInASortedArrayOfInifiniteNumbers {
    public static void main(String[] args) {
        System.out.println("Find Position of an Element in a Sorted Array of Inifinite Numbers");
        
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int[] arr2 = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 210, 350, 502, 552, 600, 649, 720};
        
        System.out.println(Arrays.toString(arr) + ", 10 = " + findPositionOfElement(arr, 10));
        System.out.println(Arrays.toString(arr2) + ", 502 = " + findPositionOfElement(arr2, 502));
    }

    private static int findPositionOfElement(int[] arr, int target) {
        // Start with box size of 2 initially
        int start = 0, end = 1;

        // While target does not fit in the box size
        // double the box size
        // end = previous end + box size * 2
        while (target > arr[end]) {
            int tempStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = tempStart;
        }

        return binarySearchPosition(arr, target, start, end);
    }

    private static int binarySearchPosition(int[] arr, int target, int start, int end) {
        while (start <= end) {
            // Calculate mid value
            int mid = start + (end - start) / 2;

            // If target is less than mid element, udpate the end pointer
            if (target < arr[mid])
                end = mid - 1;
            // If target is greater than mid element, update the start pointer
            else if (target > arr[mid])
                start = mid + 1;
            // If mid element matches target, return mid element
            else
                return mid;
        }
        return -1;
    }
}

/**
 * Output:
 * 
 * Find Position of an Element in a Sorted Array of Inifinite Numbers
 * [3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170], 10 = 4
 * [3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 210, 350, 502, 552, 600, 649, 720], 502 = 13
 */