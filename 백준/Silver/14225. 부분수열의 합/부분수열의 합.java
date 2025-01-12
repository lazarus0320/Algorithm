import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr;
    static boolean[] sums = new boolean[2000001];
    
    static void dfs(int index, int sum) {
        if(index == N) {
            if(sum > 0) sums[sum] = true;
            return;
        }
        
        // 현재 수를 선택하는 경우
        dfs(index + 1, sum + arr[index]);
        // 현재 수를 선택하지 않는 경우
        dfs(index + 1, sum);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        dfs(0, 0);
        
        int answer = 1;
        while(sums[answer]) {
            answer++;
        }
        
        System.out.println(answer);
    }
}