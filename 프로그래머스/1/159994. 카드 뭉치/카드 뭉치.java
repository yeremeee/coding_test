import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        List<Integer> c1Sequences = new ArrayList<>();
        List<Integer> c2Sequences = new ArrayList<>();
        List<String> cards1List = Arrays.asList(cards1);
        List<String> cards2List = Arrays.asList(cards2);
        
        for (int i = 0; i < goal.length; i++){
            String targetString = goal[i];
            
            if (cards1List.contains(targetString)){
                c1Sequences.add(cards1List.indexOf(targetString));
            } else if (cards2List.contains(targetString)){
                c2Sequences.add(cards2List.indexOf(targetString));
            }
        }
        
        int c1TempIndex = 0;
        String c1Answer = "Yes";
        String c2Answer = "Yes";
        
        for (int i = 0; i < c1Sequences.size(); i++){
            if (c1Sequences.get(i) != c1TempIndex){
                c1Answer = "No";
                break;
            } else if (c1Sequences.get(i) == null){
                c1Answer = "No";
                break;
            } else if (c1Sequences.get(i) == c1TempIndex){
                c1TempIndex++;
            } 
        }
        
        int c2TempIndex = 0;
        for (int i = 0; i < c2Sequences.size(); i++){
            if (c2Sequences.get(i) != c2TempIndex){
                c2Answer = "No";
                break;
            } else if (c2Sequences.get(i) == null){
                c2Answer = "No";
                break;
            } else if (c2Sequences.get(i) == c2TempIndex){
                c2TempIndex++;
            } 
        }
        
        if (c1Answer.equals("Yes") && c2Answer.equals("Yes")){
            answer = "Yes";
        } else {
            answer = "No";
        }
        
        return answer;
    }
}