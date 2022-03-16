/**
 * 1732. Find the Highest Altitude
 * https://leetcode.com/problems/find-the-highest-altitude/
 * Category: Array, Prefix Sum
 */

public class findTheHighestAltitude {
    public static void main(String[] args) {
        System.out.println("Find the Highest Altitude");
        int[] gain1 = {-5,1,5,0,-7};
        int[] gain2 = {-4,-3,-2,-1,4,3,2};
        System.out.println("[-5,1,5,0,-7]: " + largestAltitude(gain1));
        System.out.println("[-4,-3,-2,-1,4,3,2]: " + largestAltitude(gain2));
    }

    private static int largestAltitude (int[] gain) {
        int highest = 0, current = 0;
        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            if (current > highest)
                highest = current;
        }
        return highest;
    }
}

/**
 * Output:
 * 
 * Find the Highest Altitude
 * [-5,1,5,0,-7]: 1
 * [-4,-3,-2,-1,4,3,2]: 0
 */

/**
 * Stepwise process - 
 * 
 * Maintain 2 variables highest & current
 * Iterate through each item of gain[]
 * And keep on adding current & altitude (item of gain[])
 * In each iteration, set highest as current 
 * if the current value is greater than highest
 * 
 * Finally the resulting highest value is the altitude the biker gained
 */