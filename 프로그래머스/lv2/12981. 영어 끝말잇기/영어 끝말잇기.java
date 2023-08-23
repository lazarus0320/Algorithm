import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        HashMap<String, Integer> map = new HashMap<>();
        int cnt = 1, nCnt = 1;
        // map에다가 나온 단어들에 대해 1, 2, 3.. 카운트 붙이기
        // 이미 있는 키값이 containsKey로 잡혔다? -> answer[0] = 현제 cnt % n 하고 0인경우 n
        // answer[1] = (int)(cnt / n) + 1
        
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i]) || i >= 1 
                && words[i - 1].charAt(words[i-1].length() - 1) 
                != words[i].charAt(0) ) {
                answer[0] = cnt % n == 0 ? n : cnt % n;
                answer[1] = ((cnt-1) / n) + 1;
                break;
            }
            map.put(words[i], cnt);
            cnt++;
        }
        return answer;
    }
}