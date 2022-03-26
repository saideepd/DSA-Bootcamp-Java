/**
 * 1672. Richest Customer Wealth
 * https://leetcode.com/problems/richest-customer-wealth/
 * Category: Array, Matrix
 */

import java.util.Arrays;

public class richestCustomerWealth {
    public static void main(String[] args) {
        System.out.println("Richest Customer Wealth");

        int[][] accounts1 = {{1,2,3},{3,2,1}};
        int[][] accounts2 = {{1,5},{7,3},{3,5}};
        int[][] accounts3 = {{2,8,7},{7,1,3},{1,9,5}};

        System.out.println(Arrays.deepToString(accounts1) + " = " + maximumWealth(accounts1));
        System.out.println(Arrays.deepToString(accounts2) + " = " + maximumWealth(accounts2));
        System.out.println(Arrays.deepToString(accounts3) + " = " + maximumWealth(accounts3));

    }

    private static int maximumWealth (int[][] accounts) {
        int maxWealth = 0, sum = 0;
        for (int user = 0; user < accounts.length; user++) {
            sum = 0;
            for (int account = 0; account < accounts[user].length; account++) {
                sum += accounts[user][account];
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    } 
}

/**
 * Output:
 * 
 * Richest Customer Wealth
 * [[1, 2, 3], [3, 2, 1]] = 6
 * [[1, 5], [7, 3], [3, 5]] = 10
 * [[2, 8, 7], [7, 1, 3], [1, 9, 5]] = 17
 */