package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution229 {
    public List<Integer> majorityElement(int nums[]) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            if (map.get(num) > (n / 3)) {
                res.add(num);
            }
        }
        return res;
    }
}
