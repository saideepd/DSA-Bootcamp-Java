/**
 * 1672. Richest Customer Wealth
 * https://leetcode.com/problems/richest-customer-wealth/
 * Category: Array, Matrix
 */

public class richestCustomerWealth {
    public static void main(String[] args) {
        System.out.println("Richest Customer Wealth");
        int[][] accounts1 = { { 1, 2, 3 }, { 3, 2, 1 } };
        System.out.println("[[1,2,3],[3,2,1]]: " + maximumWealth(accounts1));
        int[][] accounts2 = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        System.out.println("[[1,5],[7,3],[3,5]]: " + maximumWealth(accounts2));
        int[][] accounts3 = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
        System.out.println("[[2,8,7],[7,1,3],[1,9,5]]: " + maximumWealth(accounts3));
    }

    private static int maximumWealth(int[][] accounts) {
        int sum = 0, maxWealth = 0;
        for (int users = 0; users < accounts.length; users++) {
            sum = 0;
            for (int bank = 0; bank < accounts[users].length; bank++) {
                sum += accounts[users][bank];
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
 * [[1,2,3],[3,2,1]]: 6
 * [[1,5],[7,3],[3,5]]: 10
 * [[2,8,7],[7,1,3],[1,9,5]]: 17
 */