package string.problems.easy;

/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
 */
public class SplitBalancedString {
    public int balancedStringSplit(String s) {

        int counter = 0;
        int numOfSplits = 0;
        for (char c : s.toCharArray()) {
            counter = (c == 'R') ? ++counter : --counter;
            if (counter == 0) {
                numOfSplits++;
            }
        }

        return numOfSplits;
    }
}
