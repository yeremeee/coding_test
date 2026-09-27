import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        List<Integer> lottoList = new ArrayList<>();
        List<Integer> winList = new ArrayList<>();
        int zeroCount = 0;
        
        for (int i : lottos){
            lottoList.add(i);
            
            if (i == 0) {
                zeroCount++;
            }
        }
        
        for (int i : win_nums){
            winList.add(i);
        }
        
        int minCount = 0;
        for (int i : lottoList){
            if (winList.contains(i)) {
                minCount++;
            }
        }
        
        switch (minCount) {
            case 6 :
                answer[1] = 1;
                break;
            
            case 5 :
                answer[1] = 2;
                break;
            
            case 4 :
                answer[1] = 3;
                break;
                
            case 3 : 
                answer[1] = 4;
                break;
            
            case 2 :
                answer[1] = 5;
                break;
            
            default :
                answer[1] = 6;
                break;    
        }
        
       int maxCount = minCount + zeroCount;
        
        switch (maxCount) {
            case 6 :
                answer[0] = 1;
                break;
            
            case 5 :
                answer[0] = 2;
                break;
            
            case 4 :
                answer[0] = 3;
                break;
                
            case 3 : 
                answer[0] = 4;
                break;
            
            case 2 :
                answer[0] = 5;
                break;
            
            default :
                answer[0] = 6;
                break;    
        }
        
        return answer;
    }
}