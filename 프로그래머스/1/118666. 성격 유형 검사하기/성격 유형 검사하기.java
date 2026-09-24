import java.util.*;

class Solution {
    HashMap<Character, Integer> type1 = new HashMap<>(
            Map.of('R', 0,
                   'T', 0)
                );
        
    HashMap<Character, Integer> type2 = new HashMap<>(
            Map.of('C', 0,
                   'F', 0)
                );
        
    HashMap<Character, Integer> type3 = new HashMap<>(
            Map.of('J', 0,
                   'M', 0)
                );
        
    HashMap<Character, Integer> type4 = new HashMap<>(
            Map.of('A', 0,
                   'N', 0)
                );
        
    HashMap<Integer, Integer> score = new HashMap<>(
            Map.of(1, 3,
                   2, 2,
                   3, 1,
                   4, 0,
                   5, 1,
                   6, 2,
                   7, 3)
                );
    
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        for (int i = 0; i < survey.length; i++){
            if (choices[i] == 4) {
                continue;
            } else if (choices[i] < 4) {
                calculateScore(survey[i].charAt(0), choices[i]);
            } else if (choices[i] > 4) {
                calculateScore(survey[i].charAt(1), choices[i]);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        if (type1.get('R') > type1.get('T')){
                sb.append('R');
        } else if (type1.get('R') < type1.get('T')){
            sb.append('T');
        } else {
            sb.append('R');
        }
        
        if (type2.get('C') > type2.get('F')){
                sb.append('C');
        } else if (type2.get('C') < type2.get('F')){
            sb.append('F');
        } else {
            sb.append('C');
        }
        
        if (type3.get('J') > type3.get('M')){
                sb.append('J');
        } else if (type3.get('J') < type3.get('M')){
            sb.append('M');
        } else {
            sb.append('J');
        }
        
        if (type4.get('A') > type4.get('N')){
                sb.append('A');
        } else if (type4.get('A') < type4.get('N')){
            sb.append('N');
        } else {
            sb.append('A');
        }
        
        return sb.toString();
    }
    
    public void calculateScore(char type, int choiceNum){
        if (type == 'R' || type == 'T'){
            type1.put(type, type1.get(type) + score.get(choiceNum));
        } else if (type == 'C' || type == 'F') {
            type2.put(type, type2.get(type) + score.get(choiceNum));
        } else if (type == 'J' || type == 'M') {
            type3.put(type, type3.get(type) + score.get(choiceNum));
        } else if (type == 'A' || type == 'N') {
            type4.put(type, type4.get(type) + score.get(choiceNum));
        }
    }
}