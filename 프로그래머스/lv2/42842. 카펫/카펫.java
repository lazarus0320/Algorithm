class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // yellow의 약수를 구한다. 가로, 세로의 후보군이 된다.
        // 각각을 +2하면 가로 세로의 길이가 된다.
        // 두 값을 곱한 값(전체 타일 수) - yellow의 가로 세로 곱한 값 = brown 타일 수 만족하는
        // x, y가 정답
        // 일단 x나 y의 최솟값은 3이된다. yellow가 1일 때 기준
        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            if (yellow % i == 0) {
                int yellowY = i;
                int yellowX = yellow / i;
                if (yellowX < yellowY) {
                    continue;
                }
                if ( (yellowX+2) * (yellowY+2) - (yellowX * yellowY) == brown) {
                    answer[0] = yellowX+2;
                    answer[1] = yellowY+2;
                    break;
                }
            }
        }
        return answer;
    }
}