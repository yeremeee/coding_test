import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        StringBuilder builder = new StringBuilder();
        
        List<Integer> excepted = new ArrayList<>();
        
        for (int i = 0; i < skip.length(); i++){
            excepted.add((int) skip.charAt(i));
        }
        
        for (int i = 0; i < s.length(); i++){
            int sAscii = (int) s.charAt(i);
            int transformed = sAscii;
            int j = 0;
            
            while (j < index){
                transformed++;
                
                if (transformed > (int) 'z') {
                    transformed -= 26;
                    
                    if (excepted.contains(transformed)) {
                        continue;
                    }
                    j++;
                } else if (excepted.contains(transformed)){
                    continue;
                } else {
                    j++;
                }
            }
            
            builder.append((char) (transformed));
        }
        
        
        return builder.toString();
    }
}