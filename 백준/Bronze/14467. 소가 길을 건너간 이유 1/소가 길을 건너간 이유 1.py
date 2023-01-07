import sys
input = sys.stdin.readline
cow = [-1] * 11
cnt = 0
for _ in range(int(input())):
  index, pos = map(int, input().split())
  if cow[index] == -1:
    cow[index] = pos
  elif cow[index] != pos:
    cnt += 1
    cow[index] = pos
print(cnt)