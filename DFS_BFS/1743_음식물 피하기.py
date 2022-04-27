import sys; input = sys.stdin.readline
from collections import deque

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]


def bfs(a, b):
    queue = deque([[a, b]])
    visited[a][b] = 1
    cnt = 1
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            ddx = x + dx[i]
            ddy = y + dy[i]
            if 0 <= ddx < N and 0 <= ddy < M:
                if not visited[ddx][ddy] and graph[ddx][ddy] == '#':
                    queue.append([ddx, ddy])
                    visited[ddx][ddy] = 1
                    cnt += 1
    return cnt

N, M, K = map(int, input().split())
visited = [[0] * (M) for _ in range(N)]
graph = [list('.' for _ in range(M)) for _ in range(N)]

max_cnt = 0
for _ in range(K):
    x, y = map(int, input().split())
    graph[x-1][y-1] = '#'

for i in range(N):
    for j in range(M):
        if graph[i][j] == '#' and visited[i][j] == 0:
            max_cnt = max(max_cnt, bfs(i, j))
print(max_cnt)
