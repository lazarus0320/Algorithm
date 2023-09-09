import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;
        
        int answer = 0;
        List<String> cache = new ArrayList<>();
        
        for (String city : cities) {
            city = city.toLowerCase();
            
            if (cache.contains(city)) { // cache hit
                answer += 1;
                cache.remove(city); // 기존 위치에서 제거
            } else { // cache miss
                answer += 5;
                
                if (cache.size() >= cacheSize) {
                    cache.remove(0); // LRU 알고리즘에 따라 가장 오래된 데이터 제거
                }
            }
            
            cache.add(city); // 새로운 데이터 추가 또는 최신화
        }
        
        return answer;
    }
}