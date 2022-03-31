/**
 * 852. Peak Index In A Mountain Array
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 * Category: Array, Binary Search
 * 
 * Mountain Array is also known as Bitonic Array
 * The Array increases in the 1st Part & decreases in the 2nd part like a mountain
 */

 import java.util.Arrays;

public class peakIndexInAMountainArray {
    public static void main(String[] args) {
        System.out.println("Peak Index in a Mountain Array");

        int[] arr1 = {0,1,0};
        int[] arr2 = {0,2,1,0};
        int[] arr3 = {0,10,5,2};
        int[] arr4 = {0,10,15,23,19,13,8,5,2};

        System.out.println(Arrays.toString(arr1) + " = " + peakIndexInMountainArray(arr1));
        System.out.println(Arrays.toString(arr2) + " = " + peakIndexInMountainArray(arr2));
        System.out.println(Arrays.toString(arr3) + " = " + peakIndexInMountainArray(arr3));
        System.out.println(Arrays.toString(arr4) + " = " + peakIndexInMountainArray(arr4));
    }

    private static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        // Not having <= condition as we want to compare in 2 parts of array
        while (start < end) {
            // Calculate mid value
            int mid = start + (end - start) / 2;

            // If mid element > mid+1 element
            // It means you're in decreasing part of array
            // This could be the possible answer, but look to the left side of array
            // This is why end != mid - 1 like regular binary search
            if (arr[mid] > arr[mid + 1])
                end = mid;
            // If mid element < mid+1 element
            // It means you're in increasing part of array
            else
                start = mid + 1;
        }
        // In the end, start == end and pointing to the largest number because of the 2 checks above
        // start & end are always trying to find the largest number in above 2 checks
        // hence they are pointing to just one element, that is the max element because that is what the checks do
        // Elaborated : At every point of start & end, they have the best possible answer till that time
        // and if we're saying that only one items is remaining, hence because of above line that is the best possible answer
        return start;
    }
}

/**
 * Output:
 * 
 * Peak Index in a Mountain Array
 * [0, 1, 0] = 1
 * [0, 2, 1, 0] = 1
 * [0, 10, 5, 2] = 1
 * [0, 10, 15, 23, 19, 13, 8, 5, 2] = 3
 */