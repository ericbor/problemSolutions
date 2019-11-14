package string.problems.easy;

/**
 * https://leetcode.com/problems/remove-outermost-parentheses/
 */
public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String S) {

        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (c == '(') {
                if (counter != 0) {
                    sb.append(c);
                }
                counter++;
            } else {
                counter--;
                if (counter != 0) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveOutermostParentheses test = new RemoveOutermostParentheses();
        test.removeOuterParentheses("(()(()))");
    }
}
