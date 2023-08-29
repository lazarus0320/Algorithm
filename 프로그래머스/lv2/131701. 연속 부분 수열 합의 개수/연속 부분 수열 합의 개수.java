import java.util.*;
class Solution {
    public int solution(int[] elements) {

        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 1; i <= elements.length; i++) {
            
            for (int j = 0; j < elements.length; j++) {
                int temp = 0;
                int idx = j;
                for (int k = 0; k < i; k++) {
                    temp += elements[idx % elements.length];
                    idx++;
                }
                set.add(temp);
            }
        }
        return set.size();
    }
}