import java.util.*;
class Solution {
    public List<Integer> solution(String s) {
        List<Integer> answer = new ArrayList<>();
        
        s = s.substring(2, s.length());
        s = s.substring(0, s.length() - 2).replace("},{", "-");
        
        String[] tempStr = s.split("-");

        Arrays.sort(tempStr, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        
        for (String t : tempStr) {
            String[] temp = t.split(",");
            for (int i = 0; i < temp.length; i++) {
                int n = Integer.parseInt(temp[i]);
                if (!answer.contains(n)) {
                    answer.add(n);
                }
            }
        }
        
        return answer;
    }
}