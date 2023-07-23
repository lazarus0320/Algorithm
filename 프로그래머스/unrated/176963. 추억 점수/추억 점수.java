import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        /*
        반복문으로 name 배열의 문자열을 하나씩 순회하면서
        map에 name와 yearnig값을 key, value로 삽입.
        photo 2차원 배열을 돌면서 answer에 각 행의 합을 map에서 조회하여 더함
        answer의 범위는 photo.length;
        */
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for (int i = 0; i < photo.length; i++) {
            int tempTotal = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (!map.containsKey(photo[i][j])) {
                    tempTotal += 0;
                }
                else tempTotal += map.get(photo[i][j]);
            }
            answer[i] = tempTotal;
        }
        return answer;
    }
}