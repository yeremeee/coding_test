import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            
            if (stack.isEmpty()) {
                stack.push(num);
            } else {
                int top = stack.peek();
                
                if (top == num) {
                    continue;
                } else {
                    stack.push(num);
                }
            }
        }
        
        answer = stack.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}