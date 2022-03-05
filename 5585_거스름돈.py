import sys
coins = [500, 100, 50, 10, 5, 1]
give = int(sys.stdin.readline())
doller = 1000 - give
cnt = 0
for c in coins:
    cnt += doller // c
    doller %= c
print(cnt)