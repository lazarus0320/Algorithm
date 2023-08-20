class Solution {
    public int solution(int n) {
        String nowBinary = Integer.toBinaryString(n);
        int nowCnt = 0;
        for (char c : nowBinary.toCharArray()) {
            if (c == '1') {
                nowCnt++;
            }
        }
        // int nowLength1 = nowBinary.length();
        // nowBinary = nowBinary.replaceAll("1", "");
        // int nowLength2 = nowBinary.length();
        // int nowCnt = nowLength1 - nowLength2;
        
        while (true) {
            String afterBinary = Integer.toBinaryString(++n);
            int afterCnt = 0;
            for (char c : afterBinary.toCharArray()) {
            if (c == '1') {
                afterCnt++;
            }
        }
            // int afterLength1 = afterBinary.length();
            // afterBinary = afterBinary.replaceAll("1", "");
            // int afterLength2 = afterBinary.length();
            // int afterCnt = afterLength1 - afterLength2;
        
            if (nowCnt == afterCnt) {
                break;
            }
        }
        return n;
    }
}