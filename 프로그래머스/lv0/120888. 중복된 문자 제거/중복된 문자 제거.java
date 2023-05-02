import java.util.*;
class Solution {
    public String solution(String my_string) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) < 2) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}