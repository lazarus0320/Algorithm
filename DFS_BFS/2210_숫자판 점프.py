import sys; input = sys.stdin.readline

def dfs(x, y, six_nums):
    six_nums += numbers[x][y]
    if len(six_nums) == 6:
        if six_nums not in result:
            result.append(six_nums)
        return
    else:
        for i in range(4):
            ndx = x + dx[i]
            ndy = y + dy[i]
            if 0 <= ndx < 5 and 0 <= ndy < 5:
                dfs(ndx, ndy, six_nums)
        
    

numbers = [list(input().split()) for _ in range(5)]
six_nums = ''
result = []
dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]
for i in range(5):
    for j in range(5):
        dfs(i, j, six_nums)
print(len(result))
