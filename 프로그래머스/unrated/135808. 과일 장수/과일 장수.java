import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);
        }
        PriorityQueue<Integer> box = new PriorityQueue<>();
        while (pq.size() >= m) {
            for (int i = 0; i < m; i++) {
                int apple = pq.poll();
                box.add(apple);
            }
            answer += (box.peek() * m);
            box.clear();
        }
        return answer;
    }
}