import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        Stack<Integer> subCon = new Stack<>();
        Stack<Integer> mainCon = new Stack<>();
        
        for (int i = order.length; i > 0; i--){
            mainCon.push(i);
        }
        
        int i = 0;
        
        while (i < order.length) {
            int target = order[i];
            
            if (!subCon.isEmpty() && subCon.peek() == target) {
                subCon.pop();
                answer++; 
                i++;
            } else if (!mainCon.isEmpty() && mainCon.peek() == target) {
                mainCon.pop();
                answer++;
                i++;
            } else if (!mainCon.isEmpty()){
                subCon.push(mainCon.pop());
            } else {
                break;
            }
            
            
            
        }
        
        return answer;
    }
}