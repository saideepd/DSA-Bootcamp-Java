/**
 * 278. First Bad Version
 * https://leetcode.com/problems/first-bad-version/
 * Category: Binary Search, Interactive
 */

public class firstBadVersion {
    public static void main(String[] args) {
        System.out.println("First Bad Version");

        System.out.println("5, 4 = " + firstBadVersion(5, 4));
        System.out.println("1, 1 = " + firstBadVersion(1, 1));
        System.out.println("3, 1 = " + firstBadVersion(3, 1));
    }

    private static int firstBadVersion(int n, int bad) {
        // Start from 1 till n as per the condition
        int start = 1, end = n;
        while (start <= end) {
            // Calculate mid value
            int mid = start + (end - start) / 2;

            // If the mid value is bad, check towards left of mid for possible badVersions
            // Update the end pointer
            if (isBadVersion(mid, bad))
                end = mid - 1;
            // Else look towards right array of mid
            else
                start = mid + 1;
        }
        // Return start as that is the possible answer
        return start;
    }

    // Just a stub to make the code work as per API in problem
    private static boolean isBadVersion(int mid, int bad) {
        return mid >= bad;
    }
}

/**
 * Output:
 * 
 * First Bad Version
 * 5, 4 = 4
 * 1, 1 = 1
 * 3, 1 = 1
 */