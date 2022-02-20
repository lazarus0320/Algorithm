from collections import deque
N = int(input())
lst = deque([i for i in range(1, N+1)])
while len(lst) > 1:
    lst.popleft()
    f = lst.popleft()
    lst.append(f)
print(lst[0])