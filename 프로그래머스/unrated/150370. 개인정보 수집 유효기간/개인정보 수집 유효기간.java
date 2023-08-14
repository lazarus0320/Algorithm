import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        String[] todayArr = today.split("\\.");
        int totalToday = Integer.parseInt(todayArr[0])*28*12 + 
            Integer.parseInt(todayArr[1])*28 + Integer.parseInt(todayArr[2]);
        
        for (int i = 0; i < terms.length; i++) {
            String[] termArr = terms[i].split(" ");
            map.put(termArr[0].charAt(0), Integer.parseInt(termArr[1]));
        }
        
        for (int i = 0; i < privacies.length; i++) {
            String[] priArr = privacies[i].split(" ");
            String[] priDayArr = priArr[0].split("\\.");
            int getTerm = map.get(priArr[1].charAt(0)) * 28;
            
            int totalPriDay = Integer.parseInt(priDayArr[0])*28*12 + 
                Integer.parseInt(priDayArr[1])*28 + 
                Integer.parseInt(priDayArr[2]) +
                getTerm;
            
            if (totalToday >= totalPriDay) {
                list.add(i+1);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}