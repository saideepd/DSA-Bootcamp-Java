/**
 * 1886. Determine whether Matrix can be obtained by Rotation
 * https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
 * Category: Array, Matrix
 */

import java.util.Arrays;

public class determineWhetherMatrixCanBeObtainedByRotation {
    public static void main(String[] args) {
        System.out.println("Determine whether Matrix can be obtained by Rotation");

        int[][] mat1 = {{0,1},{1,0}};
        int[][] mat2 = {{0,1},{1,1}};
        int[][] mat3 = {{0,0,0},{0,1,0},{1,1,1}};

        int[][] target1 = {{1,0},{0,1}};
        int[][] target2 = {{1,0},{0,1}};
        int[][] target3 = {{1,1,1},{0,1,0},{0,0,0}};

        System.out.println(Arrays.deepToString(mat1) + ", " + Arrays.deepToString(target1) + " = " + findRotation(mat1, target1));
        System.out.println(Arrays.deepToString(mat2) + ", " + Arrays.deepToString(target2) + " = " + findRotation(mat2, target2));
        System.out.println(Arrays.deepToString(mat3) + ", " + Arrays.deepToString(target3) + " = " + findRotation(mat3, target3));
    }

    private static boolean findRotation(int[][] mat, int[][] target) {
        int width = mat[0].length;
        int height = mat.length;
        
        boolean noRotation = true, rotateRightOneTime = true, rotateRightTwoTimes = true, rotateRightThreeTimes = true;
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Check if target matches without rotation
                if (mat[i][j] != target[i][j])
                    noRotation = false;
                
                // Rotate mat to right 90 degrees one time
                if (mat[i][j] != target[j][width - 1 - i])
                    rotateRightOneTime = false;
                
                // Rotate mat to right 180 degress two times
                if (mat[i][j] != target[height - 1 - i][width - 1 - j])
                    rotateRightTwoTimes = false;
                
                // Rotate mat to right 270 degrees three times
                if (mat[i][j] != target[height - 1 - j][i])
                    rotateRightThreeTimes = false;
                    
                // If none of the conditions satisfy, return false
                if (!noRotation && !rotateRightOneTime && !rotateRightTwoTimes && !rotateRightThreeTimes)
                    return false;
            }
        }
        
        return noRotation || rotateRightOneTime || rotateRightTwoTimes || rotateRightThreeTimes;
    }
}

/**
 * Output:
 * 
 * Determine whether Matrix can be obtained by Rotation
 * [[0, 1], [1, 0]], [[1, 0], [0, 1]] = true
 * [[0, 1], [1, 1]], [[1, 0], [0, 1]] = false
 * [[0, 0, 0], [0, 1, 0], [1, 1, 1]], [[1, 1, 1], [0, 1, 0], [0, 0, 0]] = true
 */