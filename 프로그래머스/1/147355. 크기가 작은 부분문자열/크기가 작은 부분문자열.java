import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        //부분 문자열 개수
        int partsLength = t.length() - (p.length() - 1);
        String[] parts = new String[partsLength];
        
        List<Character> tArray = new ArrayList<>();
        
        for(char c : t.toCharArray()){
            tArray.add(c);
        }
        
        for(int i = 0; i < partsLength; i++){
            StringBuilder add = new StringBuilder();
            
            for(int j = 0; j < p.length(); j++)
            {
                add.append(tArray.get(j));
            }    
            
            parts[i] = add.toString();
            tArray.remove(0);
        }
        
        for(int i = 0; i < parts.length; i++){
            if(Long.parseLong(parts[i]) <= Long.parseLong(p)){
                answer++;
            }
        }
                                       
                                    
        return answer;
    }
}