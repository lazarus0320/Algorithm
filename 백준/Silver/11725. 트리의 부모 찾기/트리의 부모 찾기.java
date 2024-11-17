import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static int N, M;
	static ArrayList<Integer> list[];
	static boolean[] visited;
	static int[] parents;
	static Stack<Integer> stack = new Stack<>();
	
	private static void dfs(int node) {
		
		visited[node] = true;
        
        for (int next : list[node]) {
            if (!visited[next]) {
                parents[next] = node;
                dfs(next);
            }
        }

	
	}

	public static void main(String[] args) throws IOException {
		
		N = Integer.parseInt(br.readLine());
		
		visited = new boolean[N+1];
		
		list = new ArrayList[N+1];
		
		for (int i = 0; i < N+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		parents = new int[N+1];
		
		for (int i = 0; i < N-1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			list[x].add(y);
			list[y].add(x);
		}
		
		dfs(1);
		
		for (int i = 2; i < parents.length; i++) {
			System.out.println(parents[i]);
		}
		
	}
}