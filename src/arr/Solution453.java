package arr;

import java.util.Arrays;

public class Solution453 {
    public int minMoves(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for (int i = nums.length - 1; i > 0; i--) {
            count += nums[i] - nums[0];
        }
        return count;
    }
}
