/**
 * 832. Flipping An Image
 * https://leetcode.com/problems/flipping-an-image/
 * Category: Array, Two Pointers, Matrix, Simulation
 */

import java.util.Arrays;

public class flippingAnImage {
    public static void main(String[] args) {
        System.out.println("Flipping An Image");

        int[][] image1 = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] image2 = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println("[[1,1,0],[1,0,1],[0,0,0]] = " + Arrays.deepToString(flipAndInvertImage(image1)));
        System.out.println("[[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]] = " + Arrays.deepToString(flipAndInvertImage(image2)));
    }

    private static int[][] flipAndInvertImage(int[][] image) {
        // Reverse Array & perform bitwise operation
        for (int i = 0; i < image.length; i++) {
            reverse(image[i]);
        }
        return image;

        // Similar approach, just slight difference in reverse logic
        // for (int i = 0; i < image.length; i++) {
        //     int[] rows = image[i];
        //     int start = 0, end = rows.length - 1;
        //     while (start <= end) {
        //         int temp = rows[start] == 0 ? 1 : 0;
        //         rows[start] = rows[end] == 0 ? 1 : 0;
        //         rows[end] = temp;
        //         start++;
        //         end--;
        //     }
        // }
        // return image;
    }

    private static void reverse(int[] rows) {
        int start = 0;
        while (start < rows.length / 2) {
            int end = rows.length - 1 - start;
            int temp = rows[start] == 0 ? 1 : 0;
            rows[start] = rows[end] == 0 ? 1 : 0;
            rows[end] = temp;
            start++;
        }
    }
}

/**
 * Output:
 * 
 * Flipping An Image
 * [[1,1,0],[1,0,1],[0,0,0]] = [[1, 0, 0], [0, 1, 0], [1, 1, 1]]
 * [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]] = [[1, 1, 0, 0], [0, 1, 1, 0], [0, 0, 0, 1], [1, 0, 1, 0]]
 */