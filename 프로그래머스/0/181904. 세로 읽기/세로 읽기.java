class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int len = my_string.length();
        
        int index = c - 1;
        
        while (index < len) {
            sb.append(my_string.charAt(index));
            index += m;
        }
        
        return sb.toString();
    }
}