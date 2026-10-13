import java.util.*;

class Solution {
    Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        boolean[] visited = new boolean[numbers.length()];

        dfs(numbers, "", visited);

        int answer = 0;

        for (int num : set) {
            if (isPrime(num)) {
                answer++;
            }
        }

        return answer;
    }

    void dfs(String numbers, String current, boolean[] visited) {
        if (!current.isEmpty()) {
            set.add(Integer.parseInt(current));
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                
                dfs(numbers, current + numbers.charAt(i), visited);
                
                visited[i] = false;
            }
        }
    }

    boolean isPrime(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}