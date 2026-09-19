import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();
        
        HashMap<String, Integer> termsMap= new HashMap<>();
        
        for (int i = 0; i < terms.length; i++){
            termsMap.put(terms[i].split(" ")[0], 
                         Integer.parseInt(terms[i].split(" ")[1]));
        }
    
        for (int i = 0; i < privacies.length; i++) {
            String pDate = privacies[i].split(" ")[0];
            String pTerm = privacies[i].split(" ")[1];
            
            String[] pDateArray = pDate.split("\\.");
            int[] deletedDate = new int[3];
            
            int addYear = 0;
            int addMonth = 0;

            if (termsMap.get(pTerm) > 12) {
                addYear = termsMap.get(pTerm) / 12;
                addMonth = termsMap.get(pTerm) % 12;
            } else{
                addMonth = termsMap.get(pTerm);
            }
            
            if (Integer.parseInt(pDateArray[1]) + addMonth > 12) {
                addYear++;
                deletedDate[1] = Integer.parseInt(pDateArray[1]) + addMonth -12;
            } else {
                deletedDate[1] = Integer.parseInt(pDateArray[1]) + addMonth;
            }
            
            deletedDate[0] = Integer.parseInt(pDateArray[0]) + addYear;
            deletedDate[2] = Integer.parseInt(pDateArray[2]);
            
            for (int j = 0; j < deletedDate.length; j++) {
                System.out.println(deletedDate[j]);
            }
            
            if (deletedDate[0] < Integer.parseInt(today.split("\\.")[0])){
                result.add(i + 1);
            } else if(deletedDate[0] == Integer.parseInt(today.split("\\.")[0])
                     && deletedDate[1] < Integer.parseInt(today.split("\\.")[1])){
                 result.add(i + 1);
            } else if(deletedDate[0] == Integer.parseInt(today.split("\\.")[0])
                     && deletedDate[1] == Integer.parseInt(today.split("\\.")[1])
                     && deletedDate[2] <= Integer.parseInt(today.split("\\.")[2])){
                 result.add(i + 1);
            }
            
        }
        
        int[] answer = new int[result.size()];
        
        for (int j = 0; j < result.size(); j++){
            answer[j] = result.get(j);
        }
        
        return answer;
    }
}