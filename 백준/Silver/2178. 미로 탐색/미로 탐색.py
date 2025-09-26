from collections import deque

N, M = map(int, input().split())
maze = []
for _ in range(N):
    maze.append(list(input().strip()))

visited = [[False] * M for _ in range(N)]
visited[0][0] = True

dr = [0, 0, 1, -1]
dc = [1, -1, 0, 0]

queue = deque([(0, 0, 1)])  # ✅ 튜플로 감싸기!

while queue:
    r, c, dist = queue.popleft()
    
    if r == N - 1 and c == M - 1:
        print(dist)
        break
    
    for i in range(4):
        nr = r + dr[i]
        nc = c + dc[i]
        
        if (0 <= nr < N and 0 <= nc < M and 
            maze[nr][nc] == '1' and not visited[nr][nc]):  # ✅ '1'로 비교!
            visited[nr][nc] = True
            queue.append((nr, nc, dist + 1))