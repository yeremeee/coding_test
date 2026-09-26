import java.util.*;

class Solution {
    
    HashMap<String, Integer> courseCountMap = new HashMap<>();
    
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        List<String> result = new ArrayList<>();
        
        for (int size : course) {
            for (String order : orders) {
                char[] chars = order.toCharArray();
                Arrays.sort(chars);
                order = new String(chars);
                
                countCourse(order, "", 0, size);
            }
        }
        
        for (int size : course) {
            int maxCount = 0;

            for (Map.Entry<String, Integer> entry : courseCountMap.entrySet()){
                String menu = entry.getKey();
                int count = entry.getValue();
                
                if (menu.length() == size) {
                    maxCount = Math.max(maxCount, count);
                }
            }
            
            for (Map.Entry<String, Integer> entry : courseCountMap.entrySet()) {
                String menu = entry.getKey();
                int count = entry.getValue();

                if (menu.length() == size && 
                    count == maxCount && 
                    count >= 2) {
                    result.add(menu);
                }
            }

        }
        Collections.sort(result);

        answer = result.toArray(new String[0]);

        return answer;
    }
    
    public void countCourse(String orders, String current, 
                            int start, int size) {
        
        if (current.length() == size){
            courseCountMap.put(current, 
                               courseCountMap.getOrDefault(current, 0) + 1);
            return;
        }
    
        for (int i = start; i < orders.length(); i++){
            countCourse(orders, 
                       current + orders.charAt(i),
                       i + 1,
                       size);
        }
        
    }
}