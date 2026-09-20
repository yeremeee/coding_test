import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        List<String> parts = new ArrayList<>();
        List<String> result = new ArrayList<>();
        
        int readAt = 0;
        
        for (int i = 0; i < s.length(); i++){
            parts = List.of(s.substring(readAt, i + 1), s.substring(i + 1));
            
            char target = parts.get(0).charAt(0);
            
            int targetCount = 0;
            int notTargetCount = 0;
            
            for (int j = 0; j < parts.get(0).length(); j++){
                if (target == parts.get(0).charAt(j)){
                    targetCount++;
                } else {
                    notTargetCount++;
                }
            }
            
            if (targetCount == notTargetCount){
                result.add(parts.get(0));
                readAt = i + 1;
            } else if (i == s.length() - 1) {
                result.add(parts.get(0));
            }
            
        }
        
        for (int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
        answer = result.size();
    
        return answer;
    }
}