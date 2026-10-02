import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        Queue<String> participantQ = new LinkedList<>();
        Queue<String> completionQ = new LinkedList<>();
        
        for (String s : participant){
            participantQ.offer(s);
        }
        
        for (String s : completion){
            completionQ.offer(s);
        }
        
        while (!completionQ.isEmpty()) {
            if (participantQ.peek().equals(completionQ.peek())) {
                participantQ.poll();
                completionQ.poll();
            } else {
                answer = participantQ.poll();
                break;
            }
        }
        
        if (answer.equals("")) {
            answer = participantQ.poll();
        }
        return answer;
    }
}