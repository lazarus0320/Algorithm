import sys; input = sys.stdin.readline
sys.setrecursionlimit(10**6)
def dfs(x, y):
    if x < 0 or x >= M or y < 0 or y >= N:
        return
    if graph[x][y] == 0:
        return
    graph[x][y] = 0
    
    dfs(x+1, y)
    dfs(x, y+1)
    dfs(x-1, y)
    dfs(x, y-1)
    
T = int(input())
for _ in range(T):
    N, M, K = map(int, input().split())
    graph = [[0]*N for _ in range(M)]
    result = 0
    for _ in range(K):
        x, y = map(int, input().split())
        graph[y][x] = 1
    
    for x in range(M):
        for y in range(N):
            if graph[x][y] == 1:
                dfs(x, y)
                result += 1
    print(result)