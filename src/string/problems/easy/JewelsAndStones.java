package string.problems.easy;

/**
 * https://leetcode.com/problems/jewels-and-stones/
 */
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {

        int num = 0;
        for (char stone : S.toCharArray()) {
            for (char jewel : J.toCharArray()) {
                if (jewel == stone) {
                    num++;
                }
            }
        }

        return num;
    }
}
