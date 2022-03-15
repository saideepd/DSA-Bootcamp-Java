/**
 * 1773. Count Items Matching A Rule
 * https://leetcode.com/problems/count-items-matching-a-rule/
 * Category: Array, String
 */

import java.util.ArrayList;
import java.util.List;

public class countItemsMatchingARule {
    public static void main(String[] args) {
        System.out.println("Count Items Matching A Rule\n");

        // Test Case 1 List
        List<List<String>> list01 = new ArrayList<>();
        List<String> innerList01 = new ArrayList<>();
        innerList01.add("phone"); innerList01.add("blue"); innerList01.add("pixel");
        list01.add(innerList01);
        
        List<String> innerList02 = new ArrayList<>();
        innerList02.add("computer"); innerList02.add("silver"); innerList02.add("lenovo");
        list01.add(innerList02);
        
        List<String> innerList03 = new ArrayList<>();
        innerList03.add("phone"); innerList03.add("gold"); innerList03.add("iphone");
        list01.add(innerList03);

        
        // Test Case List 2
        List<List<String>> list02 = new ArrayList<>();
        List<String> innerList11 = new ArrayList<>();
        innerList11.add("phone"); innerList11.add("blue"); innerList11.add("pixel");
        list02.add(innerList11);
        
        List<String> innerList12 = new ArrayList<>();
        innerList12.add("computer"); innerList12.add("silver"); innerList12.add("phone");
        list02.add(innerList12);
        
        List<String> innerList13 = new ArrayList<>();
        innerList13.add("phone"); innerList13.add("gold"); innerList13.add("iphone");
        list02.add(innerList13);
        

        String ruleKey1 = "color";
        String ruleValue1 = "silver";
        int ans1 = countMatches(list01, ruleKey1, ruleValue1);
      
        String ruleKey2 = "type";
        String ruleValue2 = "phone";
        int ans2 = countMatches(list02, ruleKey2, ruleValue2);
        

        System.out.println("[[\"phone\",\"blue\",\"pixel\"],[\"computer\",\"silver\",\"lenovo\"],[\"phone\",\"gold\",\"iphone\"]], color, silver = " + ans1);
        System.out.println();
        System.out.println("[[\"phone\",\"blue\",\"phone\"],[\"computer\",\"silver\",\"lenovo\"],[\"phone\",\"gold\",\"iphone\"]], type, phone = " + ans2);
    }

    private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleIndex = 0, count = 0;

        switch(ruleKey) {
            case "type": ruleIndex = 0; break;
            case "color": ruleIndex = 1; break;
            case "name": ruleIndex = 2; break;
            default: ruleIndex = 0; break;
        }

        for(List<String> item : items) {
            if (item.get(ruleIndex).equals(ruleValue))
                count++;
        }

        return count;
        
    }
}

/**
 * Output:
 * 
 * Count Items Matching A Rule
 * 
 * [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], color, silver = 1
 * 
 * [["phone","blue","phone"],["computer","silver","lenovo"],["phone","gold","iphone"]], type, phone = 2
 */