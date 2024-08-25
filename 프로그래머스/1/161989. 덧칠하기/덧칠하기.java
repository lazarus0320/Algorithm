import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        // 일단 section 마다 다 칠하면 간단하겠지만 한번 칠하는 영역에 이전에 칠했던 영역을 제외하면 더 좋겠다.

        int start = section[0];
        answer++;
        
        for (int sec : section) {
            if (start + m > sec) {
                continue;
            }
            
            start = sec;
            answer++;
        }
        return answer;
    }
}