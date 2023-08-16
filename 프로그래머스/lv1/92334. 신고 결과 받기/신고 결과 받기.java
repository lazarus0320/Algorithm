import java.util.*;
class Solution {
    public int[] solution(String[] idList, String[] report, int k) {
        
        /**
        map1: 누가 누구를 저격했나?<String, HashSet<String>>
        map2: 누가 몇번 저격당했나?<String, Integer>

        
        map2의 값이 k이상인 키값에 대해 (신고 접수된 유저 목록)
        전체 유저에 대해 순회하면서 만약 그 사람이 신고한 유저중에 신고 접수된 유저가 있다면 result 반영
        */
        HashMap<String, HashSet<String>> reporterMap = new HashMap<>();
        HashMap<String, Integer> badguyCountMap = new HashMap<>();
        HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));
        
        for (String reportInfo : reportSet) {
            String reporter = reportInfo.split(" ")[0];
            String badguy = reportInfo.split(" ")[1];
            
            reporterMap.putIfAbsent(reporter, new HashSet<String>(){{
                add(badguy);  //key 없는 경우 넣기
            }});
            //key 있는 경우 아래만 실행
            reporterMap.get(reporter).add(badguy);
            badguyCountMap.put(badguy, badguyCountMap.getOrDefault(badguy, 0) + 1);
        }
        
        int[] answer = new int[idList.length];
        
        for (String badguy : badguyCountMap.keySet()) {
            int badguyCount = badguyCountMap.get(badguy);
            if (badguyCount >= k) { // 신고자들 중에 신고 접수된 사람을 저격했던 사람 찾기
                for (int i = 0; i < idList.length; i++) {
                    if (reporterMap.containsKey(idList[i]) &&
                       reporterMap.get(idList[i]).contains(badguy)) {
                        answer[i]++;
                    }
                }
            }
        }
        return answer;
    }
}