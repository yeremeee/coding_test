class Solution {
    public int[] solution(String[][] places) {
        int[] answer = {1, 1, 1, 1, 1};
        
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length; j++){
                for (int k = 0; k < places[i][j].length(); k++){
                    if(places[i][j].charAt(k) == 'P'){
                        if (k + 1 < 5) {
                            if (places[i][j].charAt(k + 1) == 'P'){
                                answer[i] = 0;
                            }
                        }
                        
                        if (j + 1 < 5) {
                            if (places[i][j + 1].charAt(k) == 'P') {
                                answer[i] = 0;
                            }
                        }
                        
                        if (k + 2 < 5) {
                            if (places[i][j].charAt(k + 2) == 'P' &&
                                places[i][j].charAt(k + 1) == 'O') {
                                answer[i] = 0;
                            }
                        }
                        
                        if (j + 2 < 5) {
                            if (places[i][j + 2].charAt(k) == 'P' &&
                                places[i][j + 1].charAt(k) == 'O') {
                                answer[i] = 0;
                            }
                        }
                        
                        if (k + 1 < 5 && j + 1 < 5) {
                            if (places[i][j + 1].charAt(k + 1) == 'P') {
                                if (places[i][j].charAt(k + 1) == 'O' ||
                                    places[i][j + 1].charAt(k) == 'O'){
                                    answer[i] = 0;
                                }
                            }
                        }
                        
                        if (k - 1 >= 0 && j + 1 < 5){
                            if (places[i][j + 1].charAt(k - 1) == 'P'){
                                if (places[i][j].charAt(k - 1) == 'O' ||
                                    places[i][j + 1].charAt(k) == 'O'){
                                    answer[i] = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}