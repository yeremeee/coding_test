import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] scores = {0, 0, 0};
        
        for (int i = 0; i < answers.length; i++){
            if (answers[i] == person1[i % person1.length]) {
                scores[0]++;
            }
            
            if (answers[i] == person2[i % person2.length]) {
                scores[1]++;
            }
            
            if (answers[i] == person3[i % person3.length]) {
                scores[2]++;
            }
        }
        
        int maxScore = 0;
        
        for (int i = 0; i < scores.length; i++){
            maxScore = Math.max(maxScore, scores[i]);
        }
        
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < scores.length; i++){
            if (scores[i] == maxScore){
                result.add(i + 1);
            }
        }
        
        return result.stream()
             .mapToInt(Integer::intValue)
             .toArray();
    }
}