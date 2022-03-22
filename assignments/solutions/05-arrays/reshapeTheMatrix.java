/**
 * 566. Reshape the Matrix
 * https://leetcode.com/problems/reshape-the-matrix/
 * Category: Array, Matrix, Simulation
 */

import java.util.Arrays;

public class reshapeTheMatrix {
    public static void main(String[] args) {
        System.out.println("Reshape the Matrix");

        int[][] mat = { { 1, 2 }, { 3, 4 } };

        System.out.println(Arrays.deepToString(mat) + ", 1, 4 = " + Arrays.deepToString(matrixReshape(mat, 1, 4)));
        System.out.println(Arrays.deepToString(mat) + ", 2, 4 = " + Arrays.deepToString(matrixReshape(mat, 2, 4)));
    }

    private static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        int[][] result = new int[r][c];

        // Return mat if size of matrix can't be mapped
        if ((r * c) != (m * n))
            return mat;

        // Return mat if the rows & cols of matrix matches exactly
        if ((m == r) && (n == c))
            return mat;

        // Pointers to track original matrix
        int pR = 0, pC = 0;

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                // Store col values
                result[pR][pC] = mat[row][col];

                // Increment col pointer to check next col value
                pC++;

                // If we reach the col length the array will overflow
                // So move to the next row & reset col
                if (pC == c) {
                    pR++;
                    pC = 0;
                }
            }
        }

        return result;
    }
}

/**
 * Output:
 * 
 * Reshape the Matrix
 * [[1, 2], [3, 4]], 1, 4 = [[1, 2, 3, 4]]
 * [[1, 2], [3, 4]], 2, 4 = [[1, 2], [3, 4]]
 */