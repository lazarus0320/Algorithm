import sys; input = sys.stdin.readline
sys.setrecursionlimit(10 ** 5)

def dfs(x,y):
    dx, dy = [0, 0, 1, -1], [1, -1, 0, 0]
    for i in range(4):
        nx, ny = x + dx[i], y + dy[i]
        if nx >= N or nx < 0 or ny >= M or ny < 0 or visited[nx][ny]:
            continue
        if field[nx][ny] != 0:
            visited[nx][ny] = 1
            dfs(nx, ny)

T = int(input())
for _ in range(T):
    M, N, K = map(int,input().split())
    field = [[0] * M for _ in range(N)]
    visited = [[0] * M for _ in range(N)]
    ans = 0
    for _ in range(K):
        a, b = map(int,input().split())
        field[b][a] = 1
    for i in range(N):
        for j in range(M):
            if field[i][j] and not visited[i][j]:
                visited[i][j] = 1
                ans += 1
                dfs(i,j)
    print(ans)
