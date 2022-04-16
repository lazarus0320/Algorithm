import sys;
dish = sys.stdin.readline().rstrip()
h = 10 # 처음에는 무조건 10
for i in range(1, len(dish)):
    if dish[i-1] == dish[i]:
        h += 5
    else:
        h += 10
print(h)
