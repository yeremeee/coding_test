import java.util.*;

class Solution {  
    Stack<Integer> result = new Stack<>();
    int answer = 0;
    
    public int solution(int[][] board, int[] moves) {
        Stack<Integer>[] stacks = new Stack[board.length];  
        
        for (int i = 0; i < board.length; i++){
            stacks[i] = new Stack<>();
        }
        
        for (int i = stacks.length - 1; i >= 0; i--){
            for (int j = 0; j < board[i].length; j++){
                if (board[i][j] == 0){
                    continue;
                }
                
                stacks[j].push(board[i][j]);
            }
        }
        
        for (int i = 0; i < moves.length; i++){
            int targetLoc = moves[i];
            
            check(stacks[moves[i] - 1]);
        }
        return answer;
    }
    
    public void check(Stack<Integer> stack){
        if (!stack.isEmpty()){
            if (result.isEmpty()){
                result.push(stack.pop());
            } else {
                if (result.peek() == stack.peek()){
                    stack.pop();
                    result.pop();
                    answer += 2;
                } else {
                    result.push(stack.pop());
                }
            }
        }
        
    }
}