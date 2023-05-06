import java.util.*;
import java.io.*;
class Solution {
    public String solution(String s) {
        Map <Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        map.forEach((key, value) -> {
            if (value == 1) {
                sb.append(String.valueOf(key));
            }
        });
        char[] charArr = sb.toString().toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}