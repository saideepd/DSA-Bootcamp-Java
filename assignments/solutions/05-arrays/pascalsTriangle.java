/**
 * 118. Pascal's Triangle
 * https://leetcode.com/problems/pascals-triangle/
 * Category: Array, Dynamic Programming
 */

import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {
    public static void main(String[] args) {
        System.out.println("Pascal's Triangle");

        System.out.println("5 = " + generate(5));
        System.out.println("3 = " + generate(3));
        System.out.println("1 = " + generate(1));
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();

        for (int i = 0; i < numRows; i++) {
            // Set the first element to 1
            row.add(0, 1);
            // Sum of previous & previous right
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            // Add the row ArrayList to pascal ArrayList after each iteration
            pascal.add(new ArrayList<Integer>(row));
        }

        // Print the array in Pascal's Triangle format
        System.out.println();
        for (int i = 0; i < pascal.size(); i++) {
            String space = String.format("%" + (pascal.size() - i) + "s", " ");
            System.out.printf("%s%s\n", space, pascal.get(i));
        }
        System.out.println();

        return pascal;
    }
}

/**
 * Output:
 * 
 * Pascal's Triangle
 * 
 *      [1]
 *     [1, 1]
 *    [1, 2, 1]
 *   [1, 3, 3, 1]
 *  [1, 4, 6, 4, 1]
 * 
 * 5 = [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
 * 
 *    [1]
 *   [1, 1]
 *  [1, 2, 1]
 * 
 * 3 = [[1], [1, 1], [1, 2, 1]]
 * 
 *  [1]
 * 
 * 1 = [[1]]
 */