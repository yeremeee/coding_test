import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        int answer = 0;
        int n = message.length();
        
        int[] spoiler = new int[n];
        Arrays.fill(spoiler, -1);
        
        for (int i = 0; i < spoiler_ranges.length; i++) {
            int start = spoiler_ranges[i][0];
            int end = spoiler_ranges[i][1];
            
            for (int j = start; j <= end; j++) {
                spoiler[j] = i;
            }
        }
        
        Set<String> nonSpoilerWords = new HashSet<>();
        List<String[]> spoilerWords = new ArrayList<>();
        
        int start = 0;
        
        for (int i = 0; i <= n; i++) {
            if (i == n || message.charAt(i) == ' '){
                String word = message.substring(start, i);
                
                int reveal = -1;
            
                for (int j = start; j < i; j++) {
                    reveal = Math.max(reveal, spoiler[j]);
                }
                
                if (reveal == -1) {
                    nonSpoilerWords.add(word);
                } else {
                    spoilerWords.add(new String[]{
                        word,
                        String.valueOf(reveal),
                        String.valueOf(start)
                    });
                }
                
                start = i + 1;
            }
        }

        spoilerWords.sort((a, b) -> {
            int revealA = Integer.parseInt(a[1]);
            int revealB = Integer.parseInt(b[1]);

            if (revealA != revealB) {
                return Integer.compare(revealA, revealB);
            }

            return Integer.compare(
                Integer.parseInt(a[2]),
                Integer.parseInt(b[2])
            );
        });

        Set<String> revealedWords = new HashSet<>();

        for (String[] info : spoilerWords) {
            String word = info[0];

            if (!nonSpoilerWords.contains(word)
                    && !revealedWords.contains(word)) {
                answer++;
            }

            revealedWords.add(word);
        }
        
        return answer;
    }
}