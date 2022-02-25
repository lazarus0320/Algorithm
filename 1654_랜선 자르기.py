import sys
input = sys.stdin.readline
k, n = map(int, input().split())
lst = [int(input()) for _ in range(k)]

left, right = 1, max(lst)


while left <= right:
    cnt = 0
    mid = (left+right) // 2
    for i in lst:
        cnt += i // mid
    if cnt >= n:
        left = mid + 1
    else:
        right = mid - 1

print(right)