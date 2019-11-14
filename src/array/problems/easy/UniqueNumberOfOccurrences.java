package array.problems.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/unique-number-of-occurrences/
 */
public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            Integer value = map.get(i);
            if (value != null) {
                map.put(i, value + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (Integer value : map.values()) {
            if (!set.add(value)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        UniqueNumberOfOccurrences test = new UniqueNumberOfOccurrences();
        test.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3});
    }
}
