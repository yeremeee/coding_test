class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            
            if (c == ' ') {
                sb.append(' ');
            } else if (Character.isUpperCase(c)) {
                int sum = c + n;
                
                if (sum > 90) {
                    c = (char) (sum - 26);
                    sb.append(c);
                } else {
                    sb.append((char) (c + n));
                }
            } else if(Character.isLowerCase(c)) {
                int sum = c + n;
                
                if (sum > 122) {
                    c = (char) (sum - 26);
                    sb.append(c);
                } else {
                    sb.append((char) (c + n));
                }
            }
        }

        return sb.toString();
    }
}