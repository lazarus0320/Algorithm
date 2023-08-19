class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        StringBuilder sb = new StringBuilder();
        int zeroCnt = 0, binaryCnt = 0;
        while (!s.equals("1")) {
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zeroCnt++;
                }
                else {
                    sb.append(c);
                }
            }
            int length = sb.length();
            s = Integer.toBinaryString(length);
            binaryCnt++;
            sb.setLength(0);
        }
        answer[1] = zeroCnt;
        answer[0] = binaryCnt;
        return answer;
    }
}
