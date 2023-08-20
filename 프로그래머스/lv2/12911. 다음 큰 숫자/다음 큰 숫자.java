class Solution {
    public int solution(int n) {

        int nowCnt = Integer.bitCount(n);
        
        while (true) {

            int afterCnt = Integer.bitCount(++n);
            if (nowCnt == afterCnt) {
                break;
            }
        }
        return n;
    }
}