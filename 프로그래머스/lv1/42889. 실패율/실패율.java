import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] countArr = new int[N + 1];
        int users = stages.length;

        for (int i = 0; i < stages.length; i++) {
            if (stages[i] > N) continue;
            countArr[stages[i]]++;
        }

        List<Double> list = new ArrayList<>();
        for (int i = 1; i < countArr.length; i++) {
            if (countArr[i] == 0) list.add(0.0);
            else {
                list.add((countArr[i] * 1.0) / (users * 1.0));
                users -= countArr[i];
            }
        }

        List<Integer> answerList = new ArrayList<>();
        while (answerList.size() < N) {
            double maxFailureRate = -1.0;
            int maxStage = -1;

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > maxFailureRate) {
                    maxFailureRate = list.get(i);
                    maxStage = i;
                }
            }

            answerList.add(maxStage + 1);
            list.set(maxStage, -1.0); // Mark the stage as visited with a negative value
        }

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
