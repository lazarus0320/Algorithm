import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long answer = 0;


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            pq.add(Long.valueOf(st.nextToken()));
        }

        while (pq.size() > 1) {
            long temp = pq.poll() + pq.poll();
            answer += temp;
            pq.add(temp);
        }
        System.out.println(answer);
    }
}
