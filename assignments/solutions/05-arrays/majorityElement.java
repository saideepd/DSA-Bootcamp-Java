import java.util.Arrays;
import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {
        System.out.println("Majority Element");

        int[] nums1 = { 3, 2, 3 };
        int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };
        int[] nums3 = { 2, 2, 1, 1, 1, 2 };

        System.out.println(Arrays.toString(nums1) + " = " + majorityElement(nums1));
        System.out.println(Arrays.toString(nums2) + " = " + majorityElement(nums2));
        System.out.println(Arrays.toString(nums3) + " = " + majorityElement(nums3));
    }

    private static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num))
                hashMap.put(num, hashMap.get(num) + 1);
            else
                hashMap.put(num, 1);

            if (hashMap.get(num) > nums.length / 2)
                return num;
        }
        System.out.println("There is no majority element");
        return 0;
    }
}

/**
 * Output:
 * 
 * Majority Element
 * [3, 2, 3] = 3
 * [2, 2, 1, 1, 1, 2, 2] = 2
 * There is no majority element
 * [2, 2, 1, 1, 1, 2] = 0
 */