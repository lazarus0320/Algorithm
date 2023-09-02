import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> wantMap = new HashMap<>();
        
        
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        
        for (int i = 0; i < discount.length - 10 + 1; i++) {
            HashMap<String, Integer> nowMap = new HashMap<>();
            
            for (int j = 0; j < 10; j++) {
                nowMap.put(discount[i+j], nowMap.getOrDefault(discount[i+j], 0) + 1);
            }
            
            boolean isEqueal = true;
            
            for (String key : wantMap.keySet()) {
                if (wantMap.get(key) != nowMap.get(key)) {
                    isEqueal = false;
                }
            }
            
            answer += isEqueal ? 1 : 0;
        }
        
            
        
        return answer;
    }
}