import java.util.*;
import java.io.*;
class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            int val = map.getOrDefault(i, 0) + 1;
            map.put(i, val);
            
        }
        int[] maxVal = {Integer.MIN_VALUE};
        int[] answer = {0};
        int[] cnt = {0};
        map.forEach((key, value) -> {
            if (maxVal[0] < value) {
                maxVal[0] = value;
                answer[0] = key;
                cnt[0] = 1;
            }
            else if (maxVal[0] == value) {
                cnt[0]++;
            }
        });
        if (cnt[0] > 1) return -1;
        else return answer[0];
    }
}