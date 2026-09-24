import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        HashSet<String> reportSet = new HashSet<>();
        
        for (String s : report){
            reportSet.add(s);
        }
        
        HashMap<String, Integer> reportedUser = new HashMap<>();
        
        for (String s : reportSet){
            reportedUser.put(
                s.split(" ")[1], 
                reportedUser.getOrDefault(s.split(" ")[1], 0) + 1
                );
        }
        
        HashMap<String, Integer> userIndex = new HashMap<>();
        
        for (int i = 0; i < id_list.length; i++){
            userIndex.put(id_list[i], i);
        }
        
        for (String s : reportSet) {
            String reporter = s.split(" ")[0];
            String reported = s.split(" ")[1];
            
            if (reportedUser.get(reported) >= k){
                answer[userIndex.get(reporter)]++;
            }
        }
        
        return answer;
    }
}