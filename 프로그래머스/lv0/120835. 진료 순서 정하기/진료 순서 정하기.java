import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] cloneArr = emergency.clone();
        
        Arrays.sort(cloneArr);
        for (int i = 0; i < emergency.length; i++) {
            int rank = Arrays.binarySearch(cloneArr, emergency[i]);
            answer[i] = answer.length - rank;
        }
        return answer;
    }
}