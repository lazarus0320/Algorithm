from collections import deque

def dfs(num):
    visited[num] = True
    next = numbers[num]

    if not visited[next]:
        dfs(next)

for _ in range(int(input())):
    N = int(input())
    numbers = [0] + list(map(int, input().split()))
    visited = [True] + [False] * N #방문여부확인용
    result = 0

    for i in range(N + 1):
        if not visited[i]:
            dfs(i)
            result += 1
    print(result)