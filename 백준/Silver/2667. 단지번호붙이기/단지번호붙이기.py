from collections import deque

N = int(input())
grid = []
for _ in range(N):
    grid.append(list(input().strip()))

visited = [[False] * N for _ in range(N)]
directions = [(-1, 0), (1, 0), (0, 1), (0, -1)]
complexes = []


def bfs(start_r, start_c):
    visited[start_r][start_c] = True
    queue = deque([(start_r, start_c)])
    count = 1

    while queue:
        row, col = queue.popleft()

        for dr, dc in directions:
            nr, nc = dr+row, dc+col

            if 0 <= nr < N and 0 <= nc < N and grid[nr][nc] == '1' and not visited[nr][nc]:
                visited[nr][nc] = True
                queue.append((nr, nc))
                count += 1
    return count




for i in range(N):
    for j in range(N):
        if grid[i][j] == '1' and not visited[i][j]:
            complexes.append(bfs(i, j))

print(len(complexes))
complexes.sort()
for count in complexes:
    print(count)