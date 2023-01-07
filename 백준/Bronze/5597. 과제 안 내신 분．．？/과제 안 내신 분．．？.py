import sys
input = sys.stdin.readline
arr = [0] * 31

for _ in range(28):
  index = int(input())
  arr[index] += 1
for i in range(1, len(arr)):
  if arr[i] == 0:
    print(i)