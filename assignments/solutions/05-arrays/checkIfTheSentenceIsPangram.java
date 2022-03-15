/**
 * 1832. Check if the Sentence is Pangram
 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 * Category: Hash Table, String
 */

public class checkIfTheSentenceIsPangram {
    public static void main(String[] args) {
        System.out.println("Check if the Sentence is Pangram");

        String sentence1 = "theQuickbroWnFoxjumpSoverthElazyDog";
        String sentence2 = "leetcode";
        String sentence3 = "Saideep";
        String sentence4 = "jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo";
        System.out.println("theQuickbroWnFoxjumpSoverthElazyDog : " + checkIfPangram(sentence1));
        System.out.println("leetcode : " + checkIfPangram(sentence2));
        System.out.println("Saideep : " + checkIfPangram(sentence3));
        System.out.println("jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo : " + checkIfPangram(sentence4));
    }

    private static boolean checkIfPangram(String sentence) {
        // If string length < 26 return false & end
        if (sentence.length() < 26)
            return false;
        
        // Create Boolean array to store alphabets presence
        boolean[] alphabets = new boolean[26];
        int index = 0;

        // If character is between A-Z and a-z
        // then calculate the index of alphabet by subracting the character from A/a
        // and update the alphabets at calculated index to true
        // to denote the given alphabet is found
        for (int i = 0; i < sentence.length(); i++) {
            if ('A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z')
                index = sentence.charAt(i) - 'A';
            else if ('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z')
                index = sentence.charAt(i) - 'a';

            alphabets[index] = true;
        }

        // Iterate through alphabets array 26 times
        // if any of the alphabet at given index is false, return false
        for (int i = 0; i < 26; i++) {
            if (!alphabets[i])
                return false;
        }

        // If above conditions are not satisfied
        // return true meaning all alphabets are present in sentence
        return true;
    }
}

/**
 * Output:
 * 
 * Check if the Sentence is Pangram
 * theQuickbroWnFoxjumpSoverthElazyDog : true
 * leetcode : false
 * Saideep : false
 * jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo : false
 */