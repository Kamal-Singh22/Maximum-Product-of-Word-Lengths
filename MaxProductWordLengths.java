import java.util.*;

public class MaxProductWordLengths {
    public static int maxProduct(String[] words) {
        int n = words.length;
        int[] bitMasks = new int[n];
        
        // Step 1: Convert each word into a bitmask representing its characters
        for (int i = 0; i < n; i++) {
            int mask = 0;
            for (char c : words[i].toCharArray()) {
                mask |= 1 << (c - 'a'); // Set the bit for this character
            }
            bitMasks[i] = mask;
        }

        int maxProduct = 0;

        // Step 2: Compare each pair of words
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Step 3: If no common letters, their AND mask will be 0
                if ((bitMasks[i] & bitMasks[j]) == 0) {
                    int product = words[i].length() * words[j].length();
                    maxProduct = Math.max(maxProduct, product);
                }
            }
        }

        return maxProduct;
    }

    // Sample test
    public static void main(String[] args) {
        String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        int result = maxProduct(words);
        System.out.println("Maximum Product of Word Lengths: " + result);
    }
}
