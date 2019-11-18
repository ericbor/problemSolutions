package string.problems.easy;

import java.util.*;

/**
 * https://leetcode.com/problems/find-common-characters/
 */
public class FindCommonCharacters {
    public List<String> commonChars(String[] A) {
        Set<String> letters = new HashSet<>();

        for (String word : A) {
            for (char c : word.toCharArray()) {
                letters.add(String.valueOf(c));
            }
        }

        List<String> results = new ArrayList<>();

        for (String letter : letters) {
            boolean shouldBeAdded = true;
            for (String word : A) {
                if (!word.contains(letter)) {
                    shouldBeAdded = false;
                }
            }

            if (shouldBeAdded) {
                int occurance = 0;

                for (String word : A) {
                    int count = word.length() - word.replace(letter, "").length();
                    if (occurance == 0) {
                        occurance = count;
                    } else if (occurance != count) {
                        occurance = Math.min(occurance, count);
                    }
                }

                for (int i = 0; i < occurance; i++) {
                    results.add(letter);
                }
            }
        }

        return results;
    }

    public static void main(String[] args) {
        FindCommonCharacters test = new FindCommonCharacters();
        test.commonChars(new String[]{"bbddabab", "cbcddbdd", "bbcadcab", "dabcacad", "cddcacbc", "ccbdbcba", "cbddaccc", "accdcdbb"});
    }
}
