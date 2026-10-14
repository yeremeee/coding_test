import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for (int i : nums) {
            set.add(i);
        }
        
        int type = nums.length / 2;
        
        if (type >= set.size()) {
            return set.size();
        } else {
            return type;
        }
    }
}