import java.util.*;

class Solution {
    public String solution(String s) {
        List<Integer> list = new ArrayList<>();
        String[] arr = s.split(" ");
        
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }
        
        int min = Collections.min(list);
        int max = Collections.max(list);
    
        return String.valueOf(min) + " " + String.valueOf(max);
    }
}