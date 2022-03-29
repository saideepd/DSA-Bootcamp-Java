/**
 * 744. Find Smallest Letter Greater Than Target
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 * Category: Array, Binary Search
 */

import java.util.Arrays;

public class findSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        System.out.println("Find Smallest Letter Greater than Target");

        char[] letters = {'c', 'f', 'j'};

        System.out.println(Arrays.toString(letters) + ", a = " + nextGreatestLetter(letters, 'a'));
        System.out.println(Arrays.toString(letters) + ", c = " + nextGreatestLetter(letters, 'c'));
        System.out.println(Arrays.toString(letters) + ", d = " + nextGreatestLetter(letters, 'd'));
        System.out.println(Arrays.toString(letters) + ", h = " + nextGreatestLetter(letters, 'h'));
        System.out.println(Arrays.toString(letters) + ", m = " + nextGreatestLetter(letters, 'm'));
    }

    private static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        while (start <= end) {
            // Calculate mid value
            int mid = start + (end - start) / 2;
            // If target is less than mid element, update end pointer
            if (target < letters[mid])
                end = mid - 1;
            // If target is greater than mid element, update start pointer
            else
                start = mid + 1;
        }
        // Return start modulo array length
        // for any target that violates condition
        // which gives value greater than target
        return letters[start % letters.length];
    }
}

/**
 * Output:
 * 
 * Find Smallest Letter Greater than Target
 * [c, f, j], a = c
 * [c, f, j], c = f
 * [c, f, j], d = f
 * [c, f, j], h = j
 * [c, f, j], m = c
 */