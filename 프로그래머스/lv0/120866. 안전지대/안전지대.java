class Solution {
    public int solution(int[][] board) {
        int[][] boomBoard = new int[board.length][board[0].length];
        for (int i=0; i < board.length; i++) {
            for (int j=0; j < board[i].length; j++) {
                if (board[i][j] == 1) checkExplosion(i, j, boomBoard);
            }
        }
        int cnt = 0;
        for (int array[]: boomBoard) {
            for (int val: array) {
                if (val == 0) cnt++;
            }
        }
        return cnt;
    }
    
    static void checkExplosion(int x, int y, int[][] boomBoard) {
        int[] valx = {-1, -1, -1, 0, 1, 1, 1, 0, 0};
        int[] valy = {-1, 0, 1, 1, 1, 0, -1, -1, 0};
        int boomX = 0;
        int boomY = 0;
        for (int i = 0; i < 9; i++) {
            boomX = x + valx[i];
            boomY = y + valy[i];
            if (boomX < boomBoard.length && boomY < boomBoard.length) {
                if (boomX >= 0 && boomY >= 0) {
                    boomBoard[boomX][boomY] = 1;
                }
            }
        }
    }
}