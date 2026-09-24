class Solution {
    
    String vowels = "AEIOU";
    
    int count = 0;
    int answer = 0;
    
    public int solution(String word) {
        dfs("", word);
        return answer;
    }
    
    public void dfs(String current, String target){
        if (!current.equals("")){
            count++;
        }
        
        if (current.equals(target)) {
            answer = count;
            return;
        }
        
        if (current.length() == 5){
            return;
        }
        
        for (int i = 0; i < vowels.length(); i++){
            char c = vowels.charAt(i);
            dfs(current + c, target);
        }
    }
}