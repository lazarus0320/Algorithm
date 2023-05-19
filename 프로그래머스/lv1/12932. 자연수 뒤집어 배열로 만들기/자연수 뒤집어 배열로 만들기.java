import java.util.*;
class Solution {
    public int[] solution(long n) {
        List <Long> list = new ArrayList<>();
        while (n >= 1) {
            list.add(n % 10);
            n /= 10;
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}