import java.util.*;

public class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stagesCount = new int[N + 2];
        
        for (int stage: stages) {
            if (stage <= N) {
                stagesCount[stage]++;
            }
        }
        
        List<StageFailRate> failRateList = new ArrayList<>();
        int remainCount = stages.length;
        
        for (int i = 1; i <= N; i++) {
            double failRate = 0.0;
            
            if (remainCount != 0) {
                failRate = (double) stagesCount[i] / remainCount;
            }
            remainCount -= stagesCount[i];
            failRateList.add(new StageFailRate(i, failRate));
            
        }
        
        failRateList.sort(null);
        
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = failRateList.get(i).stage;
        }
        
        return answer;
    }
    
    static class StageFailRate implements Comparable<StageFailRate> {
        int stage;
        double failRate;
        
        public StageFailRate(int stage, double failRate) {
            this.stage = stage;
            this.failRate = failRate;
        }
        
        @Override
        public int compareTo(StageFailRate other) {
            if (this.failRate == other.failRate) {
                return Integer.compare(this.stage, other.stage);
            }
            
            return Double.compare(other.failRate, this.failRate);
        }
    }
}