import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        PriorityQueue<Integer> queue 
            = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < score.length; i++){
            queue.offer(score[i]);
        }
        
        for (int i = 0; i < score.length / m; i++){
            int minScore = 10;
            
            for(int j = 0; j < m; j++) {
                
                int polledScore = queue.poll();

                if(polledScore < minScore){
                    minScore = polledScore;
                }
            }
        
            answer += minScore * m;
        }
        
        return answer;
    }
}