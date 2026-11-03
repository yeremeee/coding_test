class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            
            if (c == 'a') {
                sb.append('A');
            } else {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}