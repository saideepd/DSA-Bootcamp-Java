/**
 * 1380. Lucky Numbers in a Matrix
 * https://leetcode.com/problems/lucky-numbers-in-a-matrix/
 * Category: Array, Matrix
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class luckyNumbersInAMatrix {
    public static void main(String[] args) {
        System.out.println("Lucky Numbers in a Matrix");

        int[][] matrix1 = {{3,7,8},{9,11,13},{15,16,17}};
        int[][] matrix2 = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        int[][] matrix3 = {{7,8},{1,2}};
        int[][] matrix4 = {{3,6},{7,1},{5,2},{4,8}};

        System.out.println(Arrays.deepToString(matrix1) + " = " + luckyNumbers(matrix1));
        System.out.println(Arrays.deepToString(matrix2) + " = " + luckyNumbers(matrix2));
        System.out.println(Arrays.deepToString(matrix3) + " = " + luckyNumbers(matrix3));
        System.out.println(Arrays.deepToString(matrix4) + " = " + luckyNumbers(matrix4));
    }

    private static List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> luckyNum = new ArrayList<>();
        
        // find the minimum of each row of matrix
        for (int row = 0; row < matrix.length; row++) {
            int min = Integer.MAX_VALUE, index = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] < min) {
                    min = matrix[row][col];
                    index = col;
                }
            }
            
            // Check if each array row index value of the matrix
            // is less than array col index value
            // if found set isTrue to false & break loop
            boolean isTrue = true;
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][index] < matrix[col][index]) {
                    isTrue = false;
                    break;
                }
            }
            
            // if condition satisfied, add the matrix row index value to list
            if (isTrue) {
                luckyNum.add(matrix[row][index]);
            }
        }
        
        // and finally return the list
        return luckyNum;
    }
}

/**
 * Output:
 * 
 * Lucky Numbers in a Matrix
 * [[3, 7, 8], [9, 11, 13], [15, 16, 17]] = [15]
 * [[1, 10, 4, 2], [9, 3, 8, 7], [15, 16, 17, 12]] = [12]
 * [[7, 8], [1, 2]] = [7]
 * [[3, 6], [7, 1], [5, 2], [4, 8]] = []
 */