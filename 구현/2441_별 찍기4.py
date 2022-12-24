import sys
num = int(sys.stdin.readline())
star = num
for i in range(num):
  print(" " * i + "*" * star)
  star -= 1
