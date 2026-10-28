import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                list = list.subList(0, query[i] + 1);
            } else {
                list = list.subList(query[i], list.size());
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}