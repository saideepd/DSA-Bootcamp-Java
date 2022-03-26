/**
 * 1295. Find Numbers with Even Number of Digits
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * Category: Array
 */

import java.util.*;
public class findNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        System.out.println("Find Numbers with Even Number of Digits");

        int[] nums1 = {12,345,2,6,7896};
        int[] nums2 = {555,901,482,1771};
        int[] nums3 = {5550,901,4820,17};

        System.out.println(Arrays.toString(nums1) + " = " + findNumbers(nums1));
        System.out.println(Arrays.toString(nums2) + " = " + findNumbers(nums2));
        System.out.println(Arrays.toString(nums3) + " = " + findNumbers(nums3));
    }

    private static int findNumbers (int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (isEvenDigits(num))
                count++;
        }
        return count;
    }

    private static boolean isEvenDigits(int num) {
        int numLength = 0;
        while (num > 0) {
            numLength++;
            num /= 10;
        }
        return numLength % 2 == 0;
    }
}

/**
 * Output:
 * 
 * Find Numbers with Even Number of Digits
 * [12, 345, 2, 6, 7896] = 2
 * [555, 901, 482, 1771] = 1
 * [5550, 901, 4820, 17] = 3
 */