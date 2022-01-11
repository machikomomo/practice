package arr;

public class Solution1217 {
    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        int even = 0;
        for (int num : position) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(odd, even);
    }
}
