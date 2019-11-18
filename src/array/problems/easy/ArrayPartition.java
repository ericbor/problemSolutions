package array.problems.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/array-partition-i/
 */
public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result = result + nums[i];
        }

        return result;
    }
}
