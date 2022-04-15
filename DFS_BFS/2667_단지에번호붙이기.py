import sys; input = sys.stdin.readline
from collections import deque

N = int(input())
dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

def bfs(b_x, b_y, N):
    queue = deque()
    queue.append([b_x, b_y])
    visited[b_x][b_y] = 1

    home_cnt = 1
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            ddx = dx[i] + x;
            ddy = dy[i] + y;
            if 0 <= ddx < N and 0 <= ddy < N:
                if visited[ddx][ddy] == 0 and field[ddx][ddy] == 1:
                    home_cnt +=1
                    queue.append([ddx, ddy])
                    visited[ddx][ddy] = 1
    return home_cnt

lst = []
field = []
group_cnt = 0

for _ in range(N):
    field.append(list(map(int, input().rstrip())))

visited = [[0]* N for _ in range(N)]

for i in range(N):
    for j in range(N):
        if visited[i][j] == 0 and field[i][j] == 1:
            lst.append(bfs(i, j, N))
print(len(lst))
lst.sort()
for l in lst:
    print(l)
