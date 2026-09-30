import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        List<Stage> stagesFailRates = new ArrayList<>();
        
        for (int i = 1; i <= N; i++) {
            int tryCount = 0;
            int clearCount = 0;
          
            for (int j  = 0; j < stages.length; j++){
                //도전
                if (stages[j] >= i){
                    tryCount++;
                }
                
                //클리어
                if (stages[j] == i) {
                    clearCount++;
                }
            }
            
            if (tryCount == 0) {
                stagesFailRates.add(new Stage(i, 0));
            } else {
                double rate = (double)clearCount / (double)tryCount;
                stagesFailRates.add(new Stage(i, rate));
            }
         
        }
        
        stagesFailRates.sort((a, b) -> {
            if (a.failRate == b.failRate) {
                return Integer.compare(a.num, b.num);
            }

            return Double.compare(b.failRate, a.failRate);
        });
        
        for (int i = 0; i < stagesFailRates.size(); i++){
            answer[i] = stagesFailRates.get(i).num;
        }
        
        return answer;
    }
}

class Stage{
    int num;
    double failRate;
    
    Stage(int num, double failRate){
        this.num = num;
        this.failRate = failRate;
    }
}