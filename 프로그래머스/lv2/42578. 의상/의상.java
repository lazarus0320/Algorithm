import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++) {
            List<String> keyCheck = map.get(clothes[i][1]);
            if (keyCheck == null) {
                keyCheck = new ArrayList<>();
                map.put(clothes[i][1], keyCheck);
            }
            keyCheck.add(clothes[i][0]);
        }

        for (String key : map.keySet()) {
            answer *= map.get(key).size() + 1;
        }
        return answer - 1;
    }
}