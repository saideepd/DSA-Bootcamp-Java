/**
 * 74. Search a 2D Matrix
 * https://leetcode.com/problems/search-a-2d-matrix/
 * Category: Array, Binary Search, Matrix
 */

import java.util.Arrays;

public class searchA2DMatrix {
    public static void main(String[] args) {
        System.out.println("Search a 2D Matrix");

        int[][] matrix1 = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int[][] matrix2 = { { 1, 3 } };

        System.out.println(Arrays.deepToString(matrix1) + ", 3 = " + searchMatrix(matrix1, 3));
        System.out.println(Arrays.deepToString(matrix1) + ", 13 = " + searchMatrix(matrix1, 13));
        System.out.println(Arrays.deepToString(matrix1) + ", 99 = " + searchMatrix(matrix1, 99));
        System.out.println(Arrays.deepToString(matrix2) + ", 3 = " + searchMatrix(matrix2, 3));
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        // Make sure we don't run out of Array bounds
        while (row < matrix.length && col >= 0) {
            // If current element matches target, return true
            if (matrix[row][col] == target)
                return true;
            // If Current element is less than target
            // Then increment the row
            // as all the elements in that row will be less than target
            else if (matrix[row][col] < target)
                row++;
            // If current element is greater than target
            // then decrement the column
            // as all the elements below in the column will be greater than target
            else
                col--;
        }
        // Return false if target not found
        return false;
    }
}

/**
 * Output:
 * 
 * Search a 2D Matrix
 * [[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 60]], 3 = true
 * [[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 60]], 13 = false
 * [[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 60]], 99 = false
 * [[1, 3]], 3 = true
 */