import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++){
            if (check(s)) {
                answer++;
            };
            s = s.substring(1, s.length()) + s.substring(0,1);
        }

        return answer;
    }

    public boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++){
            char target = s.charAt(i);
            
            if (target == '(' ||
                target == '{' ||
                target == '[') {
                stack.push(target);
            } 
            
            if (
                target == ')' ||
                target == '}' ||
                target == ']') {
                
                if (stack.isEmpty()) {
                    return false;
                } 
                
                char top = stack.peek();
                if ((target == ')' && top == '(') ||
                    (target == '}' && top == '{') ||
                    (target == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}