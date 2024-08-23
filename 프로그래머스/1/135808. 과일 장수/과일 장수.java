import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        // score를 내림차순 정렬
        // m개를 스택에 넣기
        // m개가 들어갔을 때 m개 만큼 pop을하면서 answer에 더하기
        // 반복
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.sort(score);
        for (int i = score.length - m; i >= 0; i -= m) {
            answer += (score[i] * m);
        }
        
        return answer;
    }
}