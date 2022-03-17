/**
 * 1252. Cells with Odd Values in a Matrix
 * https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
 * Category: Array, Math, Simulation
 */

public class cellsWithOddValuesInAMatrix {
    public static void main(String[] args) {
        System.out.println("Cells with Odd Values in a Matrix");
        int[][] indices1 = { { 0, 1 }, { 1, 1 } };
        int[][] indices2 = { { 1, 1 }, { 0, 0 } };
        int m1 = 2, n1 = 3, m2 = 2, n2 = 2;
        int oddCells1 = oddCells(m1, n1, indices1);
        int oddCells2 = oddCells(m2, n2, indices2);

        System.out.println("2, 3, [[0,1],[1,1]] = " + oddCells1);
        System.out.println("2, 2, [[1,1],[0,0]] = " + oddCells2);
    }

    private static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int count = 0;

        for (int[] arr : indices) {
            int row = arr[0];
            int col = arr[1];

            // Update Row
            for (int i = 0; i < n; i++) {
                matrix[row][i]++;
            }

            // Update Column
            for (int i = 0; i < m; i++) {
                matrix[i][col]++;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 != 0)
                    count++;
            }
        }

        return count;
    }
}

/**
 * Output:
 * 
 * Cells with Odd Values in a Matrix
 * 2, 3, [[0,1],[1,1]] = 6
 * 2, 2, [[1,1],[0,0]] = 0
 */