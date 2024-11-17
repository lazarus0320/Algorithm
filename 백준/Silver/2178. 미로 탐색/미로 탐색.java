import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	static int N, M;
	static int[][] graph;
	static boolean[][] visited;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	private static class Node {
		int x, y;
		
		public Node(int y, int x) {
			this.x = x;
			this.y = y;
		}
	}
	
	private static void bfs() {
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node(1, 1));
		visited[1][1] = true;
		
		while (!queue.isEmpty()) {
			
			Node curNode = queue.poll();
			
			for (int i = 0; i < 4; i++) {
				
				int nearX = curNode.x + dx[i];
				int nearY = curNode.y + dy[i];
				
				if (nearX > 0 && nearY > 0 &&
						nearX <= M && nearY <= N && 
						graph[nearY][nearX] != 0 && !visited[nearY][nearX]) {
					
					queue.add(new Node(nearY, nearX));
					graph[nearY][nearX] = graph[curNode.y][curNode.x] + 1;
					visited[nearY][nearX] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		visited = new boolean[N+1][M+1];
		graph = new int[N+1][M+1];
		
		for (int i = 1; i <= N; i++) {
			String line = br.readLine();
			
			for (int j = 1; j <= M; j++) {
				graph[i][j] = line.charAt(j-1) - '0';
			}
		}
		
		bfs();
		System.out.println(graph[N][M]);
		
	}
}