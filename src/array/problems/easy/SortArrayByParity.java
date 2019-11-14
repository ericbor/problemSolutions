package array.problems.easy;

/**
 * https://leetcode.com/problems/sort-array-by-parity/
 */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int startIndex = 0;
        int endIndex = A.length - 1;

        for (int current : A) {
            if (current % 2 == 0) {
                result[startIndex] = current;
                startIndex++;
            } else {
                result[endIndex] = current;
                endIndex--;
            }
        }

        return result;
    }
}
