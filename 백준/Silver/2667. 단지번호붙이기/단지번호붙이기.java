import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static class Point { // 큐에서 x, y 좌표 뽑아내기용 객체
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int N, danjiNum = 0;
    static int dx[] = { -1, 1, 0, 0 };
    static int dy[] = { 0, 0, -1, 1 };
    static int [] danji;
    static int [][] map;
    static boolean [][] visited;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        danji = new int[N * N]; // NXN 크기 맵에서 단지 최대 개수는 N*N


        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken(); // 각 행마다 하나의 문자열 입력 받음
            for (int j = 0; j < N; j++) {
                map[i][j] = temp.charAt(j) - '0'; // 문자를 정수로 치환하여 각 열에 할당
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    // 집이 있는데 방문이 안된 곳이 있으면 단지수를 추가하고 해당 단지의 집이 몇개 있는지 bfs로 계산하기
                    danjiNum++;
                    countingHouseBFS(i, j);
                }
            }
        }

        Arrays.sort(danji);
        System.out.println(danjiNum);

        for (int i = 1; i < danji.length; i++) {
            if (danji[i] != 0) System.out.println(danji[i]);
        }


    }
    public static void countingHouseBFS(int i, int j) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(i, j)); // 큐에 새로운 단지의 시작 주소를 좌표값으로 집어 넣음
        visited[i][j] = true;
        danji[danjiNum]++; // 해당 단지 번호의 집 개수를 하나 올림

        while(!q.isEmpty()) {
            // 큐에서 값 하나 뽑기
            Point temp = q.poll();
            // 상하좌우를 돌아다니면서 탐색하기
            for (int k = 0; k < 4; k++) {
                int x = temp.x + dx[k];
                int y = temp.y + dy[k];
                if (x >= 0 && y >= 0 && x < N && y < N) {
                    if (map[x][y] == 1 && !visited[x][y]) {
                        // 움직인 위치가 map 범위 내에 있고, 집이 있고, 방문처리가 되지 않았을 경우
                        // 큐에 좌표를 넣고 방문처리 하고 해당 단지번호의 집 개수를 하나 올림
                        q.add(new Point(x, y));
                        visited[x][y] = true;
                        danji[danjiNum]++;
                    }
                }
            }
        }
    }
}