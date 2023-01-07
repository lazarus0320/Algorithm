import sys
input = sys.stdin.readline
for _ in range(int(input())):
  left, right = input().split()
  left = int(left, 2)
  right = int(right, 2)
  print(bin(left+right)[2:])