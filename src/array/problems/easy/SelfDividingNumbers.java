package array.problems.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/self-dividing-numbers/
 */
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++)
            if (isDivide(i)) {
                list.add(i);
            }
        return list;
    }

    private boolean isDivide(int x) {
        int temp = x;
        while (x != 0) {
            int reminder = x % 10;
            if (reminder == 0) {
                return false;
            }
            if (temp % reminder != 0) {
                return false;
            }

            x = x / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        SelfDividingNumbers test = new SelfDividingNumbers();
        List<Integer> result = test.selfDividingNumbers(1, 22);
        System.out.println(result);
    }
}
