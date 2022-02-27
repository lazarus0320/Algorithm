import sys
from collections import Counter

N = int(sys.stdin.readline())
lst = []
for i in range(N):
    lst.append(int(sys.stdin.readline().rstrip()))
print(round(sum(lst)/N))
lst.sort()
print((lst[(len(lst)-1) // 2]))

c = Counter(lst)
num_c = c.most_common()
if len(num_c) > 1:
    if num_c[0][1] == num_c[1][1]:
        print(num_c[1][0])
    else:
        print(num_c[0][0])
else:
    print(num_c[0][0])

print(lst[-1] - lst[0])