/**
 * 1572. Matrix Diagonal Sum
 * https://leetcode.com/problems/matrix-diagonal-sum/
 * Category: Array, Matrix
 */

import java.util.Arrays;

public class matrixDiagonalSum {
    public static void main (String[] args) {
        System.out.println("Matrix Diagonal Sum");

        int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat2 = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int[][] mat3 = {{5}};

        System.out.println(Arrays.deepToString(mat1) + " = " + diagonalSum(mat1));
        System.out.println(Arrays.deepToString(mat2) + " = " + diagonalSum(mat2));
        System.out.println(Arrays.deepToString(mat3) + " = " + diagonalSum(mat3));
    }

    private static int diagonalSum (int[][] mat) {
        // O(n^2)
        // int n = mat.length, sum = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (i == j)
        //             sum += mat[i][j];
                
        //         if ((i + j) == (n - 1) && (i != j))
        //             sum += mat[i][j];
        //     }
        // }

        // return sum;

        // O(n)
        int n = mat.length, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i] + mat[i][n - 1 - i];
        }

        if (n % 2 != 0)
            sum -= mat[n/2][n/2];

        return sum;
    }
}

/**
 * Output:
 * 
 * Matrix Diagonal Sum
 * [[1, 2, 3], [4, 5, 6], [7, 8, 9]] = 25
 * [[1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1]] = 8
 * [[5]] = 5
 */