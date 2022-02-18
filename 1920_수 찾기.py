def bin_search(x, key):
    ps = 0
    pl = len(x) - 1
    
    
    while True:
        pc = (ps + pl) // 2
        if x[pc] == key:
            return 1
        elif x[pc] < key:
            ps = pc + 1
        else:
            pl = pc - 1
        
        if ps > pl:
            break
    
    return 0


N = int(input())
lst = list(map(int, input().split()))
lst.sort()
M = int(input())
lst2 = list(map(int, input().split()))

for i in range(M):
    print(bin_search(lst, lst2[i]))

