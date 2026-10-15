import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        
        Arrays.sort(book_time, (a, b) -> a[0].compareTo(b[0]));
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for (String[] arr : book_time) {
            int start = Integer.parseInt(arr[0].split(":")[0]) * 60 
                + Integer.parseInt(arr[0].split(":")[1]);
            int end = Integer.parseInt(arr[1].split(":")[0]) * 60 
                + Integer.parseInt(arr[1].split(":")[1]) + 10;
            
            if (!queue.isEmpty() && queue.peek() <= start) {
                queue.poll();
            }
            
            queue.offer(end);
        }
        return queue.size();
    }
}