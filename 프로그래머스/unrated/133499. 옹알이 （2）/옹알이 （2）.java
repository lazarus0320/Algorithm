import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        /*
        일단 babbling을 순회하면서 문자열 하나씩 대본다
        words중에 bab에 있는 값들중 contains true가 있는가?
        있으면 해당 bab에서 words의 요소를 잘라냄
        연음 발음 안되므로 해당 key값에 대해 카운트를 올려야함.
        
        */
        
        for (String bab: babbling) {
            if (bab.contains("ayaaya") || bab.contains("yeye") || 
                bab.contains("woowoo") || bab.contains("mama") ) {
                    continue;
                }
            for (String word: words) {
                bab = bab.replace(word, " ");
            }
            bab = bab.replace(" ", "");
            //yyemaewoo -> ye -> 발음가능 처리가 되어 버림..
            //-> 'y e ' -> 
            if (bab.equals("")) {
                answer++;
            }
        }
        return answer;
    }
}