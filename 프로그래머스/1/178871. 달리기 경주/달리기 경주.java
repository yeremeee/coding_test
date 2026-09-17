import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        HashMap<String, Integer> playerMap = new HashMap<>();
        
        for (int i = 0; i < players.length; i++){
            playerMap.put(players[i], i);
        }
        
        for (String s : callings) {
            int index = playerMap.get(s);
            
            String player = players[index];
            
            players[index] = players[index - 1]; 
            players[index - 1] = player; 
            
            playerMap.put(player, index - 1);
            playerMap.put(players[index], index);
        }
        
        return players;
    }
}