import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        double answer = 0;
        // 다 uppercase
        // 다중집합: 
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < str1.length() - 1; i++) {
            String temp = str1.substring(i, i+2);
            if (temp.chars().allMatch(Character::isLetter)) {
                list1.add(temp);
            }
        }
        for (int i = 0; i < str2.length() - 1; i++) {
            String temp = str2.substring(i, i+2);
            if (temp.chars().allMatch(Character::isLetter)) {
                list2.add(temp);
            }
        }
        List<String> intersectionList = new ArrayList<>();
        List<String> unionList = new ArrayList<>();
        for(String s : list1){
          if(list2.remove(s)){
            intersectionList.add(s);
          }
          unionList.add(s);
      }
        for (String s: list2) {
            unionList.add(s);
        }
        double inter = intersectionList.size();
        double union = unionList.size();
        
        if (union != 0) {
            answer = Math.floor(inter / union * 65536);
        } else {
            answer = 65536;
        }

        return (int) answer;
    }
}