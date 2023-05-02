class Solution {
    public int solution(String s) {
        String sarr[] = s.split(" ");
        int cnt = 0;
        for (int i = 0; i < sarr.length; i++) {
            char c = sarr[i].charAt(0);
            if (c == 'Z') cnt -= Integer.parseInt(sarr[i-1]);
            else cnt += Integer.parseInt(sarr[i]);
        }
        return cnt;
    }
}
