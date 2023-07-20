import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n, m;
    static int[][] board;
    static boolean[][][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = (int) str.charAt(j) - '0';
            }
        }

        visited = new boolean[n][m][2]; // 2는 벽 부섰는지(1) 안부섰는지(0) 체크 여부
        System.out.println(bfs(0, 0));
    }

    private static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x, y, 1, 0));
        visited[x][y][0] = true;
        visited[x][y][1] = true;

        while (!q.isEmpty()) {
            Node pick = q.poll();
            if (pick.x == n-1 && pick.y == m-1) return pick.count;

            for(int i = 0; i < 4; i++) {
                int nx = pick.x + dx[i];
                int ny = pick.y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if(board[nx][ny] ==0) { // 벽 아닌 곳일 때
                        if (!visited[nx][ny][pick.wall]) {
                            q.add(new Node(nx, ny, pick.count + 1, pick.wall));
                            visited[nx][ny][pick.wall] = true;
                        }
                    }

                    else { // 벽인경우
                        if (pick.wall == 0 && !visited[nx][ny][1]) { 
                            // 현 위치를 벅 부수고 방문처리한 적이 없고
                            q.add(new Node(nx, ny, pick.count + 1, 1));
                            visited[nx][ny][1] = true; // 벽을 부수고 방문체크
                        }
                    }
                }
            }
        }
        return -1;
    }


    private static class Node {
        private int x;
        private int y;
        private int count;
        private int wall;

        public Node(int x, int y, int count, int wall) {
            this.x = x;
            this.y = y;
            this.count = count;
            this.wall = wall;
        }
    }
}