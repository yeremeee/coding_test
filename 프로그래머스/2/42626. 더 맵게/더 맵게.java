import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for (int i : scoville) {
            queue.offer(i);
        }
        
        while (queue.peek() < K) {
            if (queue.size() < 2) {
                return -1;
            }
            
            int newLevel = queue.poll() + queue.poll() * 2;
            queue.offer(newLevel);
            answer++;
        }
        
        return answer;
    }
}