package array.problems.easy;

/**
 * https://leetcode.com/problems/relative-sort-array/
 */
public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int currentIndex = 0;
        for (int value : arr2) {

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == value) {
                    if (currentIndex != i) {
                        int tmp = arr1[currentIndex];
                        arr1[currentIndex] = value;
                        arr1[i] = tmp;
                    }
                    ++currentIndex;
                }
            }
        }


        return arr1;
    }

    public static void main(String[] args) {
        RelativeSortArray test = new RelativeSortArray();
        test.relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6});
    }
}
