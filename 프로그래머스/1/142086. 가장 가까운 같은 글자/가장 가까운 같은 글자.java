import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        String sSub = "";
        
        for (int i = 0; i < s.length(); i++){
            sSub = s.substring(0, i);
            char target = s.charAt(i);
            
            if(sSub.equals("")){
                answer[i] = -1;
            } else {        
                int index = sSub.lastIndexOf(target);
                
                if (index == -1){
                    answer[i] = -1;
                } else {
                    answer[i] = i - index;
                }
        
            }
            
        }
               
        
        return answer;
    }
}