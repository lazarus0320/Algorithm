class Solution {
    public int solution(String dartResult) {
        int answer = 0, tempNum = 0, idx = 0;
        int[] dart = new int[3];
        String numStr = ""; // 정수를 문자열로 합쳐놓고 문자가 나오면 정수로 변환. 10이상의 수 대비
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            if (c >= '0' && c <= '9') {
                numStr += String.valueOf(c);
            }
            else if (c == 'D' || c == 'S' || c == 'T') {
                tempNum = Integer.parseInt(numStr);
                if (c == 'D') {
                    dart[idx++] = (int)Math.pow(tempNum, 2);
                }
                else if (c == 'S') {
                    dart[idx++] = (int)Math.pow(tempNum, 1);
                }
                else if (c == 'T') {
                    dart[idx++] = (int)Math.pow(tempNum, 3);
                }
                numStr = "";
            }
            else {
                if (c == '*') {
                    if (idx >= 2) {
                        dart[idx-1] *= 2;
                        dart[idx-2] *= 2;
                    }
                    else {
                        dart[idx-1] *= 2;
                    }
                }
                else if (c == '#') {
                    dart[idx-1] *= (-1);
                }
            }
            
        }
        answer = dart[0] + dart[1] + dart[2];
        return answer;
    }
}