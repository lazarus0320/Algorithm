import sys
from bisect import bisect_left, bisect_right

input = sys.stdin.readline

def bisearch(x, left, right):
    l = bisect_left(x, left)
    r = bisect_right(x, right)
    return r - l

N = int(input())
cards = sorted(list(map(int, input().split())))
M = int(input())
candidate = list(map(int, input().split()))

for i in range(M):
    print(bisearch(cards, candidate[i], candidate[i]), end = ' ')