import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        System.out.println(bfs(Integer.parseInt(br.readLine())));
    }

    public static int bfs(int n) {
        Queue<int[]> queue = new LinkedList<>();
        boolean [][] visited = new boolean[1001][1001];
        queue.add(new int[] {1, 0, 0}); // 화면, 클립보드, 시간
        visited[1][0] = true;

        while(!queue.isEmpty()) {
            int[] pick = queue.poll();

            if(pick[0] == n) { // 현재 값이 만들려는 이모티콘 개수와 같은 경우 기록된 시간을 리턴
                return pick[2];
            }

            if(pick[0] > 0 && pick[0] < 1001) { // 이모티콘 경우의 수의 범위 내에서 설정
                if(!visited[pick[0]][pick[0]]) {
                    visited[pick[0]][pick[0]] = true;
                    queue.add(new int[] {pick[0], pick[0], pick[2] + 1});
                } // 복사의 경우

                if(!visited[pick[0] - 1][pick[1]]) {
                    visited[pick[0] - 1][pick[1]] = true;
                    queue.add(new int[] {pick[0] - 1, pick[1], pick[2] + 1});
                } // 삭제의 경우

                if(pick[0] + pick[1] < 1001) {
                    if (!visited[pick[0] + pick[1]][pick[1]]) {
                        visited[pick[0] + pick[1]][pick[1]] = true;
                        queue.add(new int[]{pick[0] + pick[1], pick[1], pick[2] + 1});
                    } // 붙여넣기
                }
            }
        }
        return 0;
    }
}