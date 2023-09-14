import java.util.*;
class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int needDay = 0;
            if ( (100 - progresses[i]) % speeds[i] != 0 ) {
                needDay = (int)((100 - progresses[i]) / speeds[i]) + 1;
            }
            else {
                needDay = (100 - progresses[i]) / speeds[i];
            }


            if (!queue.isEmpty() && queue.peek() < needDay) {
                int cnt = 0;
                while (!queue.isEmpty()) {
                    queue.remove();
                    cnt++;
                }
                answer.add(cnt);
                queue.add(needDay);
            }
            else {
                queue.add(needDay);
            }
            
            if (!queue.isEmpty() && i == progresses.length - 1) {
                answer.add(queue.size());
            }
            
        }
        return answer;
    }
}