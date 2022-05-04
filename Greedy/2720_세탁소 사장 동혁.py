T = int(input())
for _ in range(T):
    getMoney = int(input())
    q, d, n, p = 0, 0, 0, 0
    while getMoney > 0:
        if getMoney >= 25:
            q = getMoney // 25
            getMoney %= 25
            
        if getMoney >= 10:
            d = getMoney // 10
            getMoney %= 10
        
        if getMoney >= 5:
            n = getMoney // 5
            getMoney %= 5
        
        if getMoney >= 1:
            p = getMoney // 1
            getMoney %= 1
    
    print(f"{q} {d} {n} {p}")
    
