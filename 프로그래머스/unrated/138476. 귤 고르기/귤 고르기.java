import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for (int tan : tangerine) {
            map.put(tan, map.getOrDefault(tan, 0) + 1);
        }
        
        List<Integer> keyMaps = new ArrayList<>(map.keySet());
        keyMaps.sort((a, b) -> map.get(b).compareTo(map.get(a)));
        
        for (int key : keyMaps) {
            k -= map.get(key);
            answer++;
            if (k <= 0) {
                break;
            }
        }
        return answer;
    }
}