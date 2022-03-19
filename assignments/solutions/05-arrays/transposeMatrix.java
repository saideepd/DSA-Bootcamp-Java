/**
 * 867. Transpose Matrix
 * https://leetcode.com/problems/transpose-matrix/
 * Category: Array, Matrix, Simulation
 */

import java.util.Arrays;

public class transposeMatrix {
    public static void main(String[] args) {
        System.out.println("Transpose Matrix");

        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{1,2,3},{4,5,6}};
        
        System.out.println("[[1,2,3],[4,5,6],[7,8,9]] = " + Arrays.deepToString(transpose(matrix1)));
        System.out.println("[[1,2,3],[4,5,6]] = " + Arrays.deepToString(transpose(matrix2)));
    }

    private static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] transposedMatrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        return transposedMatrix;
    }
}

/**
 * Output:
 * 
 * Transpose Matrix
 * [[1,2,3],[4,5,6],[7,8,9]] = [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
 * [[1,2,3],[4,5,6]] = [[1, 4], [2, 5], [3, 6]]
 */