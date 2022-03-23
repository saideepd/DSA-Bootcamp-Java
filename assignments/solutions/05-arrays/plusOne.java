/**
 * 66. Plus One
 * https://leetcode.com/problems/plus-one/
 * Category: Array, Math
 */

import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        System.out.println("Plus One");

        int[] digits1 = {1,2,3};
        int[] digits2 = {1,2,4};
        int[] digits3 = {4,3,2,1};
        int[] digits4 = {4,3,2,9};
        int[] digits5 = {9};
        int[] digits6 = {1,9};

        System.out.println(Arrays.toString(digits1) + " = " + Arrays.toString(plusOne(digits1)));
        System.out.println(Arrays.toString(digits2) + " = " + Arrays.toString(plusOne(digits2)));
        System.out.println(Arrays.toString(digits3) + " = " + Arrays.toString(plusOne(digits3)));
        System.out.println(Arrays.toString(digits4) + " = " + Arrays.toString(plusOne(digits4)));
        System.out.println(Arrays.toString(digits5) + " = " + Arrays.toString(plusOne(digits5)));
        System.out.println(Arrays.toString(digits6) + " = " + Arrays.toString(plusOne(digits6)));
    }

    private static int[] plusOne (int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (carry == 0)
                break;
            
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            for (int i = 1; i < newDigits.length; i++) {
                newDigits[i] = 0;
            }
            return newDigits;
        }

        return digits;
    }
}

/**
 * Output:
 * 
 * Plus One
 * [1, 2, 3] = [1, 2, 4]
 * [1, 2, 4] = [1, 2, 5]
 * [4, 3, 2, 1] = [4, 3, 2, 2]
 * [4, 3, 2, 9] = [4, 3, 3, 0]
 * [9] = [1, 0]
 * [1, 9] = [2, 0]
 */