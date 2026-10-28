import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = {};
    
        Arrays.sort(files, (a, b) -> {
            String headA = getHead(a);
            String headB = getHead(b);
            
            int numA = getNumber(a);
            int numB = getNumber(b);
            
            int compare = headA.compareToIgnoreCase(headB);
            
            if (compare != 0) {
                return compare;
            }

            return Integer.compare(numA, numB);
        });
            
        return files;
    }
    
    private String getHead(String file) {
        int index = 0;
        
        while (index < file.length() &&
              !Character.isDigit(file.charAt(index))) {
            index++;
        }
        
        return file.substring(0, index);
    }
    
    private int getNumber(String file) {
        int index = 0;
        
        while (index < file.length() &&
              !Character.isDigit(file.charAt(index))) {
            index++;
        }
        
        int start = index;
        
        while (index < file.length() &&
              Character.isDigit(file.charAt(index)) &&
              index - start < 5) {
            index++;
        }
        
        return Integer.parseInt(file.substring(start, index));
    }
}