class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        String[] map1 = new String[n];
        String[] map2 = new String[n];
        
        for (int i  = 0; i < n; i++){
            String s1 = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);
            
            StringBuilder sb1 = new StringBuilder(s1);
            StringBuilder sb2 = new StringBuilder(s2);
            
            while(sb1.length() < n) {
                sb1.insert(0, "0");
            }
            
            while(sb2.length() < n) {
                sb2.insert(0, "0");
            }
            
            map1[i] = sb1.toString();
            map2[i] = sb2.toString();
        }
        
        for (int i = 0; i < n; i++) {
            map1[i] = map1[i].replace("1", "#");
            map1[i] = map1[i].replace("0", " ");

            map2[i] = map2[i].replace("1", "#");
            map2[i] = map2[i].replace("0", " ");
        }
        
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            
            for (int j = 0; j < n; j++) {
                if (map1[i].charAt(j) == ' ' && map2[i].charAt(j) == ' ') {
                    sb.append(" ");
                } else {
                    sb.append("#");
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}