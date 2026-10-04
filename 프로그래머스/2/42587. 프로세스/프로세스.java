import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Process> queue = new LinkedList<>();
            
        for (int i = 0; i < priorities.length; i++) {
            Process process = new Process(i, priorities[i]);
            queue.offer(process);
        }
        
        while (!queue.isEmpty()) {
            Process current = queue.poll();
            boolean check = false;
            
            for (Process p : queue) {
                if (current.priority < p.priority) {
                    check = true;
                    break;
                }
            }
            
            if (check) {
                queue.offer(current);
            } else {
                answer++;
                
                if (current.index == location) {
                    return answer;
                }
            }
        }
        return answer;
    }
}

class Process {
    int index;
    int priority;
    
    Process(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}