class Solution {
    public String solution(int[] food) {
        String answer = "";
        // 두번째 인덱스부터 반복문으로 순회
        // 2로 나누고 배열에 몫만큼 인덱스 값을 할당, 나머지는 버리기
        // 마지막에 0을 추가한 후, 전체 사이즈 -1만큼의 범위로 반복문 역순으로 돌리면서 string에 추가
        
        for (int i = 1; i < food.length; i++) {
            if ((int)food[i] / 2 < 1) continue;
            for (int j = 0; j < (int)food[i] / 2; j++) {
                answer += String.valueOf(i);
            }
        }
        answer += "0";
        for (int i = answer.length() - 2; i >= 0; i--) {
            answer += answer.charAt(i);
        }
        return answer;
    }
}