from collections import Counter
lstx = []
lsty = []
for _ in range(3):
    x, y = map(int, input().split())
    lstx.append(x)
    lsty.append(y)
fx = Counter(lstx).most_common()
fy = Counter(lsty).most_common()
print(fx[1][0], fy[1][0])
    