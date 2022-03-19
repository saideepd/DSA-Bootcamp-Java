/**
 * 1295. Find Numbers with Even Number of Digits
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * Category: Array
 */

public class findNumbersWithEvenNumberofDigits {
    public static void main(String[] args) {
        System.out.println("Find Numbers with Even Number of Digits");

        int[] nums1 = { 12, 345, 2, 6, 7896 };
        int[] nums2 = { 555, 901, 482, 1771 };
        int[] nums3 = { 55, 4901, 4482 };

        System.out.println("[12,345,2,6,7896] = " + findNumbers(nums1));
        System.out.println("[555,901,482,1771] = " + findNumbers(nums2));
        System.out.println("[55,4901,4482] = " + findNumbers(nums3));
    }

    private static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (isEvenDigits(num))
                count++;
        }

        return count;
    }

    private static boolean isEvenDigits(int num) {
        int numLength = 1;

        while (Math.floor(num / 10) > 0) {
            num /= 10;
            numLength++;
        }

        return numLength % 2 == 0;
    }
}

/**
 * Output:
 * 
 * Find Numbers with Even Number of Digits
 * [12,345,2,6,7896] = 2
 * [555,901,482,1771] = 1
 * [55,4901,4482] = 3
 */