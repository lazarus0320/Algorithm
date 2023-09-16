import java.util.*;

class Position {
    int priority;
    int idx;

    Position(int priority, int idx) {
        this.priority = priority;
        this.idx = idx;
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        
        int answer = 0;
        Queue<Position> q = new LinkedList<>();
        int[] temp = Arrays.copyOf(priorities, priorities.length);
        Integer[] priArr = Arrays.stream(temp).boxed().toArray(Integer[]::new);
        Arrays.sort(priArr, Collections.reverseOrder());
        
        for (int i = 0; i < priorities.length; i++) {
            q.offer(new Position(priorities[i], i));
        }
        
        int idx = 0;
        while (!q.isEmpty()) {
            Position pos = q.poll();
            
            if (pos.priority == priArr[idx]) {
                answer++;
                idx++;
                
                if (pos.idx == location) {
                    break;
                }
            }
            else {
                q.offer(pos);
            }
        }
        return answer;

    }
}