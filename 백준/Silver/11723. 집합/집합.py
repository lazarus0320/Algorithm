import sys ; input = sys.stdin.readline
N = int(input())
S = set()
for _ in range(N):
    cmd = input().rstrip().split()

    if cmd[0] == 'add':
        if int(cmd[1]) in S:
            continue
        S.add(int(cmd[1]))
    elif cmd[0] == 'remove':
        if int(cmd[1]) not in S:
            continue
        S.remove(int(cmd[1]))
    elif cmd[0] == 'check':
        if int(cmd[1]) in S:
            print(1)
        else:
            print(0)
    elif cmd[0] == 'toggle':
        if int(cmd[1]) in S:
            S.remove(int(cmd[1]))
        else:
            S.add(int(cmd[1]))
    elif cmd[0] == 'all':
        S = set((range(1, 21)))
    elif cmd[0] == 'empty':
        S.clear()