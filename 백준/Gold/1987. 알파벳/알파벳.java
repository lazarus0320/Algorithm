import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int R, C;
    static int dx[] = { -1, 1, 0, 0 };
    static int dy[] = { 0, 0, -1, 1 };
    static int [][] map;
    static boolean [] visited = new boolean[26]; // 알파벳 개수
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력한 값 map에 할당
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int[R][C];
        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = str.charAt(j) - 'A';
            }
        }
        dfs(0, 0, 0);
        System.out.println(answer);
    }

    public static void dfs(int i, int j, int count) {
        if (visited[map[i][j]]) {  // 방문을 했었다면
            answer = Math.max(answer, count); // 정답을 갱신하고 리턴
        }
        else {
            visited[map[i][j]] = true;
            for (int k = 0; k < 4; k++) {
                int x = i + dx[k];
                int y = j + dy[k];

                if (x >= 0 && y >= 0 && x < R && y < C) {
                    dfs(x, y, count + 1);
                }
            }
            visited[map[i][j]] = false;
        }

    }
}