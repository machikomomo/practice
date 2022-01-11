package greedy;

class Solution55 {
    public boolean canJump(int[] nums) {
        int furthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= furthest) {
                furthest = Math.max(furthest, i + nums[i]);
            }
            if (furthest >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
