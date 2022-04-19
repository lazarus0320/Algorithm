import sys; input = sys.stdin.readline
def gcd(x, y):
    while y:
        x, y = y, x%y
    return x

N = int(input())
lst = list(map(int, input().split()))
for i in range(1, N):
    num_gcd = gcd(lst[0], lst[i])
    print(f'{lst[0]//num_gcd}/{lst[i]//num_gcd}')
