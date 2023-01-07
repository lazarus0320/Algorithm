import sys
input = sys.stdin.readline
T = int(input())
for _ in range(T):
  arr = []
  N = int(input())
  arr = list(map(int, input().split()))
  print(min(arr), max(arr))