class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
      
        while (s < e) {
            char c = my_string.charAt(s);
            
            sb.setCharAt(s, my_string.charAt(e));
            sb.setCharAt(e, my_string.charAt(s));
            
            s++;
            e--;
        }
        
        return sb.toString();
    }
}