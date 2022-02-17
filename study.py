import sys
n = int(sys.stdin.readline())
lst = []
for _ in range(n):
    title, level = sys.stdin.readline().split()
    lst.append((title, int(level)))
lst.sort(key=lambda x : x[1])
print(lst[0][0])