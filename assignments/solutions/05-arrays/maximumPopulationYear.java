/**
 * 1854. Maximum Population Year
 * https://leetcode.com/problems/maximum-population-year/
 * Category: Array, Counting
 */

import java.util.Arrays;

public class maximumPopulationYear { 
    public static void main(String[] args) {
        System.out.println("Maximum Population Year");

        int[][] logs1 = {{1993,1999},{2000,2010}};
        int[][] logs2 = {{1950,1961},{1960,1971},{1970,1981}};

        System.out.println(Arrays.deepToString(logs1) + " = " + maximumPopulation(logs1));
        System.out.println(Arrays.deepToString(logs2) + " = " + maximumPopulation(logs2));
    }

    private static int maximumPopulation (int[][] logs) {
        // Declare & initialize an array of size 2051 as its the max upper limit
        int[] year = new int[2051];

        // Increment Birth Year & Decrement Death Year of each pair
        for (int[] log : logs) {
            year[log[0]] += 1;
            year[log[1]] -= 1;
        }

        // Set some default values for Maximum Number at starting Year
        // And Maximum Year as the starting year
        int maxNum = year[1950], maxYear = 1950;

        for (int i = 1951; i < year.length; i++) {
            // Generate Prefix Sum
            // Sum of Current & Previous year
            year[i] += year[i - 1];

            // If the Current year has a value
            // that is higher than previous Max Value, update the max values
            if (year[i] > maxNum) {
                maxNum = year[i];
                maxYear = i;
            }
        }

        return maxYear;
    }
}

/**
 * Output:
 * 
 * Maximum Population Year
 * [[1993, 1999], [2000, 2010]] = 1993
 * [[1950, 1961], [1960, 1971], [1970, 1981]] = 1960
 */