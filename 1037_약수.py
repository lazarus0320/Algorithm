import sys
input = sys.stdin.readline
N = int(input())
yak = list(map(int, input().split()))
minn = min(yak)
maxx = max(yak)
print(minn*maxx)