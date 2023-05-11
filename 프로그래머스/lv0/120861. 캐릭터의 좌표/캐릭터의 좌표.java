class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int boundaryX = (int)board[0] / 2;
        int boundaryY = (int)board[1] / 2;
        int[] answer = {0, 0};
        for (String s : keyinput) {
            if (s.equals("left") && (-1) * boundaryX <= answer[0] - 1) {
                answer[0]--;
            }
            else if (s.equals("right") && boundaryX >= answer[0] + 1) {
                answer[0]++;
            }
            if (s.equals("down") && (-1) * boundaryY <= answer[1] - 1) {
                answer[1]--;
            }
            else if (s.equals("up") && boundaryY >= answer[1] + 1) {
                answer[1]++;
            }
        }
        return answer;
    }
}