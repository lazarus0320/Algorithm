import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int tan : tangerine) {
            map.put(tan, map.getOrDefault(tan, 0) + 1);
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((a, b) -> map.get(b).compareTo(map.get(a)));
        
        for (int i : keySet) {
            k -= map.get(i);
            answer++;
            if (k <= 0) {
                break;
            }
        }
        return answer;
    }
}