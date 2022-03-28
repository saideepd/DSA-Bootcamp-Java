/**
 * 374. Guess Number Higher or Lower
 * https://leetcode.com/problems/guess-number-higher-or-lower/
 * Category: Binary Search, Interactive
 */

public class guessNumberHigherOrLower {
    public static void main(String[] args) {
        System.out.println("Guess Number Higher or Lower");

        System.out.println("pick, n");
        System.out.println("10, 6 = " + guessNumber(10));
        System.out.println("1, 1 = " + guessNumber(1));
        System.out.println("2, 1 = " + guessNumber(2));
    }

    private static int guessNumber(int n) {
        int start = 1, end = n;
        while (start <= end) {
            // Calculate mid value
            int pick = start + (end - start) / 2;
            // If API returns 0, match found, return pick
            if (guess(pick) == 0)
                return pick;
            // If API returns -1, guess is higher than pick
            // Update end
            else if (guess(pick) == -1)
                end = pick - 1;
            // Guess is lower than pick
            // Update start
            else
                start = pick + 1;
        }
        return -1;
    }

    // Just a placeholder method guess()
    // actual method is an API on Leetcode
    private static int guess(int pick) {
        return pick;
    }
}

/**
 * Output:
 * 
 * Guess Number Higher or Lower
 * pick, n
 * 10, 6 = 6
 * 1, 1 = 1
 * 2, 1 = 1
 */