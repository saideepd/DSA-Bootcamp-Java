/**
 * 888. Fair Candy Swap
 * https://leetcode.com/problems/fair-candy-swap/
 * Category: Array, Hash Table, Binary Search, Sorting
 */

import java.util.Arrays;

public class fairCandySwap {
    public static void main(String[] args) {
        System.out.println("Fair Candy Swap");

        int[] aliceSizes1 = {1,1};
        int[] bobSizes1 = {2,2};
        
        int[] aliceSizes2 = {1,2};
        int[] bobSizes2 = {2,3};
        
        int[] aliceSizes3 = {2};
        int[] bobSizes3 = {1,3};
        
        System.out.println(Arrays.toString(aliceSizes1) + ", " + Arrays.toString(bobSizes1) + " = " + Arrays.toString(fairCandy(aliceSizes1, bobSizes1)));
        System.out.println(Arrays.toString(aliceSizes2) + ", " + Arrays.toString(bobSizes2) + " = " + Arrays.toString(fairCandy(aliceSizes2, bobSizes2)));
        System.out.println(Arrays.toString(aliceSizes3) + ", " + Arrays.toString(bobSizes3) + " = " + Arrays.toString(fairCandy(aliceSizes3, bobSizes3)));
    }

    private static int[] fairCandy(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;

        // Sum boxSizes of both Alice and Bob
        for (int a : aliceSizes)
            sumA += a;
        for (int b : bobSizes)
            sumB += b;

        // Calculate difference / 2 between aliceSizes and bobSizes
        int diff = (sumA - sumB) / 2;

        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {

                // Find pair where difference of sizes is equal to diff
                if (aliceSizes[i] - bobSizes[j] == diff)
                    return new int[]{ aliceSizes[i], bobSizes[j] };
            }
        }

        return new int[] { -1, -1 };
    }
}

/**
 * Output:
 * 
 * Fair Candy Swap
 * [1, 1], [2, 2] = [1, 2]
 * [1, 2], [2, 3] = [1, 2]
 * [2], [1, 3] = [2, 3]
 */