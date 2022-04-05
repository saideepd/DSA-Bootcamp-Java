/**
 * 1351. Count Negative Numbers in Sorted Matrix
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 * Category: Array, Binary Search, Matrix
 */

import java.util.Arrays;

public class countNegativeNumbersInSortedMatrix {
    public static void main(String[] args) {
        System.out.println("Count Negative Numbers in Sorted Matrix");

        int[][] grid1 = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
        int[][] grid2 = { { 3, 2 }, { 1, 0 } };

        System.out.println(Arrays.deepToString(grid1) + " = " + countNegatives(grid1));
        System.out.println(Arrays.deepToString(grid2) + " = " + countNegatives(grid2));
    }

    private static int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            // Adding negative numbers of each row
            count += countOfNegativesInEachRow(grid[i]);
        }
        return count;
    }

    private static int countOfNegativesInEachRow(int[] row) {
        int count = 0;
        int start = 0, end = row.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If mid value is positive, check in the right side
            if (row[mid] >= 0)
                start = mid + 1;
            // If mid value is negative, count all the elements to its right as they're all negative
            // and then check in the left side
            else {
                count += end - mid + 1;
                end = mid - 1;
            }
        }
        return count;
    }
}

/**
 * Output:
 * 
 * Count Negative Numbers in Sorted Matrix
 * [[4, 3, 2, -1], [3, 2, 1, -1], [1, 1, -1, -2], [-1, -1, -2, -3]] = 8
 * [[3, 2], [1, 0]] = 0
 */