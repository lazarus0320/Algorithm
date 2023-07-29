class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] paintArr = new int[n];
        for (int i = 0; i < section.length; i++) { // 주어진 환경 구현
            paintArr[section[i] - 1] = 1;
        }
        int idx = 0;
        while (idx < paintArr.length) {
            if (paintArr[idx] == 1) {
                idx += m;
                answer++;
            }
            else idx++;
        }

        return answer;
    }
}