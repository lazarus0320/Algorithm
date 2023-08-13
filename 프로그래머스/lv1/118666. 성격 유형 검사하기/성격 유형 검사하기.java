import java.util.*;
class Solution {
    public Character cal(HashMap<Character, Integer> map, Character a, Character b) {
        if (map.get(a) > map.get(b)) {
            return a;
        }
        else if (map.get(a) < map.get(b)) {
            return b;
        }
        
        else if (a < b) {
            return a;
        }
        else {
            return b;
        }
    }
    public String solution(String[] survey, int[] choices) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);
        
        for (int i = 0; i < survey.length; i++) {
            String surStr = survey[i];
            if (choices[i] <= 3) {
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + (4 - choices[i]));
            }
            else if (choices[i] >= 5) {
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + (choices[i] - 4));
            }
            else {
                continue;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(cal(map, 'R', 'T'));
        sb.append(cal(map, 'C', 'F'));
        sb.append(cal(map, 'J', 'M'));
        sb.append(cal(map, 'A', 'N'));
        return sb.toString();
    }
}