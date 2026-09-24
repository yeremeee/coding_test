import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        int[] notFound = new int[10];
        
        for (int i = 0; i < numbers.length; i++){
            notFound[numbers[i]] = 1;
        }
        
        for (int i = 0; i < notFound.length; i++){
            if (notFound[i] == 0){
                answer += i;
            }
        }
        
        return answer;
    }
}