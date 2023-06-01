import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int[][] board = new int[N+1][N+1];

        // K줄에 걸쳐서 사과의 위치 설정
        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            board[row][col] = 1;     // 사과가 있는 장소는 1로 구분함.
        }

        int L = Integer.parseInt(br.readLine());

        // 시간에 따라 회전시킬 방향에 대한 queue(뱀의 머리에 대한 queue)
        // 입력받은 L의 길이만큼 시간에 따른 회전 방향에 대한 정보를 큐에 담음
        Queue<spin> spin = new LinkedList<>();
        for (int i = 0; i < L; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int time = Integer.parseInt(st.nextToken());
            String direction = st.nextToken();
            spin.add(new spin(time, direction));
        }

        // 뱀의 다음 이동 방향에 대한 경우의 수 생성
        // 0: 북, 1: 동, 2: 남, 3: 서 (시계방향)
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        // 맨처음에는 뱀이 (1,1)에서 동쪽을 바라보도록 설정
        int row = 1;
        int col = 1;
        int time = 0;
        int direction = 1;

        Queue<Node> queue = new LinkedList<>(); // 뱀의 몸통 위치에 대한 queue
        queue.add(new Node(row, col)); // 몸통의 위치를 pair 형태로 기록
        board[row][col] = 2; // 뱀의 몸통이 위치하는 곳은 2로 지정.

        while (true) {
            // 현재 바라보는 방향으로 한칸씩 이동
            int dR = row + dr[direction];
            int dC = col + dc[direction];
            time++;

            // 벽에 닿거나 머리가 몸통에 닿을 경우 게임 끝
            if(dR < 1 || dC < 1 || dR > N || dC > N) break;
            if(board[dR][dC] == 2) break;

            if(board[dR][dC] == 0) {    // 아무것도 없는 빈공간에 도착한 경우
                Node node = queue.poll(); // 이전 시간의 몸통 위치에 대한 큐 값을 빼서 pair에 재할당
                board[node.row][node.col] = 0;  // 몸통이 지나갔으므로 이제 아무것도 없어야 함. 따라서 0을 기록.
            }

            if(!spin.isEmpty()) { // 시간, 방향 pair 객체 정보가 남아있을 경우
                if (time == spin.peek().time) { // 뱀머리 돌아갈 시간과 일치할 경우
                    spin s = spin.poll();

                    // 반시계 방향으로 머리 돌리기. direction이 0인 경우 3으로 바꿔야함.
                    if (s.direction.equals("L")) direction = direction - 1 < 0 ? 3 : direction - 1;
                    // 시계 방향으로 머리 돌리기. direction이 3인 경우 0으로 바꿔야 함.
                    if (s.direction.equals("D")) direction = direction + 1 > 3 ? 0 : direction + 1;
                }
            }
            board[dR][dC] = 2; // 현위치를 몸통 값인 2로 기록
            queue.add(new Node(dR, dC)); // 몸통 queue에 저장
            row = dR; col = dC;
        }
        bw.write(String.valueOf(time)); // 게임 종료시 시간을 기록
        bw.flush();
        bw.close();
    }
}
class spin {    // 시간과 방향을 pair로 저장할 객체
    int time;
    String direction;

    spin(int time, String direction){
        this.time = time;
        this.direction = direction;
    }
}

class Node {    // 몸통의 위치를 지정할 객체
    int row, col;

    Node(int row, int col) {
        this.row = row;
        this.col = col;
    }
}