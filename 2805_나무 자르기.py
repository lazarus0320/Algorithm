import sys
input = sys.stdin.readline
N, M = map(int, input().split())
hlst = list(map(int, input().split()))

ps = 1
pl = max(hlst)
while ps <= pl:
    pc = (ps + pl) // 2
    summ = sum([i-pc if pc < i else 0 for i in hlst])
    if summ >= M:
        ps = pc + 1
    else:
        pl = pc - 1
print(pl)