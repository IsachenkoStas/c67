package HomeTask11;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int reverse(int x) {
        StringBuilder str;
        str = new StringBuilder(String.valueOf(x));
        String s = str.reverse().toString();
        return Integer.parseInt(s);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] twoNums = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                twoNums[1] = i;
                twoNums[0] = map.get(target - nums[i]);
                return twoNums;
            }
            map.put(nums[i],i);
        }
        return twoNums;
    }
}


