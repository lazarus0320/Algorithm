import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        /* 1. 반복문 한번 돌리면서 해시맵에 저장
        */
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int zeroCnt = 0, rightNum = 0;
        for (int i: lottos) {
            if (i == 0) {
                zeroCnt++;
            }
            else map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (int i: win_nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) == 2) {
                rightNum++;
            }
        }
        answer[0] = rightNum+zeroCnt >= 2 ? 6 - (zeroCnt + rightNum) + 1 : 6;
        answer[1] = rightNum >= 2 ? 6 - rightNum + 1 : 6;
        return answer;
    }
}