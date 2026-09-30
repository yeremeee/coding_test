import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> answerList = new ArrayList<>();
        
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++){
            int comDate = (100 - progresses[i]) / speeds[i];
            
            if ((100 - progresses[i]) % speeds[i] != 0){
                comDate++;
            }
            
            queue.offer(comDate);
        }
        
        while (!queue.isEmpty()) {
            int deployDate = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && queue.peek() <= deployDate){
                count++;
                queue.poll();
            }
            
            answerList.add(count);
        }
        
        int[] answer = new int[answerList.size()];
        
        for (int i = 0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        
        
        return answer;
    }
}