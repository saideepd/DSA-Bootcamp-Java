/**
 * Search in Sorted Matrix
 * https://www.youtube.com/watch?v=enI_KyGLYPo&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=20
 * Category: Array, Binary Search
 */

import java.util.Arrays;

public class sortedMatrix {
    public static void main(String[] args) {
        System.out.println("Search in Sorted Matrix");

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println(Arrays.deepToString(matrix) + ", 4 = " + Arrays.toString(search(matrix, 4)));
        System.out.println(Arrays.deepToString(matrix) + ", 6 = " + Arrays.toString(search(matrix, 6)));
        System.out.println(Arrays.deepToString(matrix) + ", 9 = " + Arrays.toString(search(matrix, 9)));
        System.out.println(Arrays.deepToString(matrix) + ", 5 = " + Arrays.toString(search(matrix, 5)));
        System.out.println(Arrays.deepToString(matrix) + ", 99 = " + Arrays.toString(search(matrix, 99)));
    }

    // Binary Search in the row provided between the cols provided
    private static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            // If target matches, return the matrix position
            if (target == matrix[row][mid])
                return new int[] { row, mid };
            // If target is less than current value, update cEnd pointer
            if (target < matrix[row][mid])
                cEnd = mid - 1;
            // If target is greater than current value, update cStart pointer
            else
                cStart = mid + 1;
        }
        return new int[] { -1, -1 };
    }

    private static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // Be careful, matrix can be empty

        // Perform Binary Search when the matrix contains only 1 row
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        // Row pointers
        int rStart = 0;
        int rEnd = rows - 1;
        // Mid pointer to column which is half the length of columns
        int cMid = cols / 2;

        // Run loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { // while this is true, it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;

            if (target == matrix[mid][cMid])
                return new int[] { mid, cMid };
            else if (target < matrix[mid][cMid])
                rEnd = mid;
            else
                rStart = mid;
        }

        // Once the above loop has completed running
        // We're left with 2 rows
        // Check whether the target is in the col of 2 rows
        if (target == matrix[rStart][cMid])
            return new int[] { rStart, cMid };
        if (target == matrix[rStart + 1][cMid])
            return new int[]{ rStart + 1, cMid};


        // Search in 1st half
        if (target <= matrix[rStart][cMid - 1])
            return binarySearch(matrix, rStart, 0, cMid - 1, target);

        // Search in 2nd half
        if (target <= matrix[rStart][cMid + 1] && target <= matrix[rStart][cMid + 1])
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);

        // Search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1])
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);

        // Search in 4th half
        if (target <= matrix[rStart + 1][cMid + 1])
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);

        return new int[] { -1, -1 };
    }
}

/**
 * Output:
 * 
 * Search in Sorted Matrix
 * [[1, 2, 3], [4, 5, 6], [7, 8, 9]], 4 = [1, 0]
 * [[1, 2, 3], [4, 5, 6], [7, 8, 9]], 6 = [1, 2]
 * [[1, 2, 3], [4, 5, 6], [7, 8, 9]], 9 = [2, 2]
 * [[1, 2, 3], [4, 5, 6], [7, 8, 9]], 5 = [1, 1]
 * [[1, 2, 3], [4, 5, 6], [7, 8, 9]], 99 = [-1, -1]
 */