# import sys
# input = sys.stdin.readline

# N = int(input())
# A = list(map(int, input().split()))
# B = list(map(int, input().split()))

# A.sort()
# B.sort(reverse=True)
# print(A)
# print(B)
# S = 0
# for i in range(N):
#     S += (A[i] * B[i])
# print(S)
import sys
input = sys.stdin.readline

N = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))

A.sort()
S = 0
for i in range(N):
    max_i = B.index(max(B))
    S += (A[i] * B[max_i])
    B.remove(B[max_i])
print(S)