/**
 * Bubble Sort
 * https://www.youtube.com/watch?v=F5MZyqRp_IM&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=18
 * Catergory: Array, Sorting
 */

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble Sort\n");

        int[] arr1 = { 3, 1, 5, 4, 2 };
        System.out.println("Before Sorting = " + Arrays.toString(arr1));
        bubble(arr1);
        System.out.println("After Sorting = " + Arrays.toString(arr1) + "\n");

        int[] arr2 = { 1, 2, 3, 4, 5 };
        System.out.println("Before Sorting = " + Arrays.toString(arr2));
        bubble(arr2);
        System.out.println("After Sorting = " + Arrays.toString(arr2) + "\n");

        int[] arr3 = { -3, 3, -16, 0, 1, 10, -44 };
        System.out.println("Before Sorting = " + Arrays.toString(arr3));
        bubble(arr3);
        System.out.println("After Sorting = " + Arrays.toString(arr3));
    }

    private static int[] bubble(int[] arr) {
        boolean swapped;
        // Run the steps n - 1 times
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            // For each step, max item will be placed at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            // If any value swap is not swapped for a particular value of i
            // it means the array is sorted & hence stop the loop
            if (!swapped)
                break;
        }

        return arr;
    }
}

/**
 * Output:
 * 
 * Bubble Sort
 * 
 * Before Sorting = [3, 1, 5, 4, 2]
 * After Sorting = [1, 2, 3, 4, 5]
 * 
 * Before Sorting = [1, 2, 3, 4, 5]
 * After Sorting = [1, 2, 3, 4, 5]
 * 
 * Before Sorting = [-3, 3, -16, 0, 1, 10, -44]
 * After Sorting = [-44, -16, -3, 0, 1, 3, 10]
 */