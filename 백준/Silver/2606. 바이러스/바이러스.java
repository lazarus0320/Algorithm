import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static int[][] graph;
	static boolean[] visited;
	static int N, M;
	static Stack<Integer> stack = new Stack<>();
	
	private static int dfs(int start) {
		
		int count = 0;
		
		visited[start] = true;
		stack.push(start);
		
		while (!stack.isEmpty()) {
			
			int node = stack.pop();
			
			for (int i = 1; i <= N; i++) {
				
				if (graph[node][i] == 1 && !visited[i]) {
					count++;
					
					stack.push(i);
					visited[i] = true;
				}
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) throws IOException {
		
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		
		graph = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for (int i = 0; i < M; i++) {
			
			StringTokenizer sb = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(sb.nextToken());
			int y = Integer.parseInt(sb.nextToken());
			
			
			graph[x][y] = graph[y][x] = 1;
			
			
		}
		
		System.out.println(dfs(1));
	}
}
