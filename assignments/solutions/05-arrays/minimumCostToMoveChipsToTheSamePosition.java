/**
 * 1217. Minimum Cost to Move Chips to the Same Position
 * https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
 * Category: Array, Math, Greedy
 */

import java.util.Arrays;

public class minimumCostToMoveChipsToTheSamePosition {
    public static void main(String[] args) {
        System.out.println("Minimum Cost to Move Chips to the Same Position");

        int[] position1 = {1,2,3};
        int[] position2 = {2,2,2,3,3};
        int[] position3 = {1,1000000000};

        System.out.println(Arrays.toString(position1) + " = " + minCostToMoveChips(position1));
        System.out.println(Arrays.toString(position2) + " = " + minCostToMoveChips(position2));
        System.out.println(Arrays.toString(position3) + " = " + minCostToMoveChips(position3));
    }

    private static int minCostToMoveChips(int[] position) {
        int even = 0;
        for (int chip : position) {
            if (chip % 2 == 0)
                even++;
        }

        return Math.min(even, position.length - even);
    }
}

/**
 * Output:
 * 
 * Minimum Cost to Move Chips to the Same Position
 * [1, 2, 3] = 1
 * [2, 2, 2, 3, 3] = 2
 * [1, 1000000000] = 1
 */