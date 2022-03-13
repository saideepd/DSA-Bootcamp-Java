/**
 * 1431. Kids With the Greatest Number of Candies
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 * Category: Array
 */

import java.util.ArrayList;
import java.util.List;

public class kidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        System.out.println("Kids With the Greatest Number of Candies");
        int[] candies1 = { 2, 3, 5, 1, 3 };
        int extraCandies1 = 3;
        List<Boolean> result1 = kidsWithCandies(candies1, extraCandies1);
        System.out.println("[2,3,5,1,3], 3 : " + result1);
        int[] candies2 = { 4, 2, 1, 1, 2 };
        int extraCandies2 = 1;
        List<Boolean> result2 = kidsWithCandies(candies2, extraCandies2);
        System.out.println("[4,2,1,1,2], 1 : " + result2);
        int[] candies3 = { 12, 1, 12 };
        int extraCandies3 = 10;
        List<Boolean> result3 = kidsWithCandies(candies3, extraCandies3);
        System.out.println("[12,1,12], 10 : " + result3);
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int currentMax = 0;
        for (int i = 0; i < candies.length; i++) {
            currentMax = Math.max(currentMax, candies[i]);
        }

        ArrayList<Boolean> result = new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            result.add((candies[i] + extraCandies) >= currentMax);
        }

        return result;
    }
}

/**
 * Output:
 * 
 * Kids With the Greatest Number of Candies
 * [2,3,5,1,3], 3 : [true, true, true, false, true]
 * [4,2,1,1,2], 1 : [true, false, false, false, false]
 * [12,1,12], 10 : [true, false, true]
 */