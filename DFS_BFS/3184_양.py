import sys; input = sys.stdin.readline
from collections import deque

v, o = 0, 0

def bfs(x, y):
    global v
    global o
    queue = deque()
    queue.append([x, y])
    visited[x][y] = 1
    v_cnt, o_cnt = 0, 0
    if field[x][y] == 'v':
        v_cnt += 1
    if field[x][y] == 'o':
        o_cnt += 1
        
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            ndx = x + dx[i]
            ndy = y + dy[i]
            if 0 <= ndx < R and 0 <= ndy < C and visited[ndx][ndy] == 0 and field[ndx][ndy] != '#':
                if field[ndx][ndy] == 'v':
                    v_cnt += 1
                if field[ndx][ndy] == 'o':
                    o_cnt += 1
                queue.append([ndx, ndy])
                visited[ndx][ndy] = 1
    if v_cnt < o_cnt:
        v -= v_cnt
    else:
        o -= o_cnt
        

R, C = map(int, input().split())
visited = [[0]*C for _ in range(R)]
field = []
for i in range(R):
    f = list(input().strip())
    for j in range(C):
        if f[j] == 'o':
            o += 1
        if f[j] == 'v':
            v += 1
    field.append(f)
        

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]
for i in range(R):
    for j in range(C):
        if (field[i][j] == 'o' or field[i][j] == 'v') and visited[i][j] == 0:
            bfs(i, j)
print(o, v)
