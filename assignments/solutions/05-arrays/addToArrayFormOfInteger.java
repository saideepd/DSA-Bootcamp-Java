/**
 * 929. Add to Array-Form of Integer
 * https://leetcode.com/problems/add-to-array-form-of-integer/
 * Category: Array, Math
 */

import java.util.*;

public class addToArrayFormOfInteger {
    public static void main(String[] args) {
        System.out.println("Add to Array-Form of Integer");

        int[] num1 = {1,2,0,0};
        int[] num2 = {2,7,4};
        int[] num3 = {2,1,5};
        int[] num4 = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};

        System.out.println(Arrays.toString(num1) + ", 34 = " + addToArrayForm(num1, 34));
        System.out.println(Arrays.toString(num2) + ", 181 = " + addToArrayForm(num2, 181));
        System.out.println(Arrays.toString(num3) + ", 806 = " + addToArrayForm(num3, 806));
        System.out.println(Arrays.toString(num4) + ", 516 = " + addToArrayForm(num4, 516));
    }

    private static List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length - 1;
        ArrayList<Integer> sum = new ArrayList<>();

        while (n >= 0 || k > 0) {
            if (n >= 0) {
                sum.add((num[n] + k) % 10);
                k = (num[n] + k) / 10;
                n--;
            }
            else {
                sum.add(k % 10);
                k = k / 10;
            }
        }

        Collections.reverse(sum);
        return sum;
    }
}

/**
 * Output:
 * 
 * Add to Array-Form of Integer
 * [1, 2, 0, 0], 34 = [1, 2, 3, 4]
 * [2, 7, 4], 181 = [4, 5, 5]
 * [2, 1, 5], 806 = [1, 0, 2, 1]
 * [1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3], 516 = [1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 5, 7, 9]
 */
