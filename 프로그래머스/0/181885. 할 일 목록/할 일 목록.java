import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                result.add(todo_list[i]);
            }
        }
        
        return result.stream().toArray(String[]::new);
    }
}