import sys; input = sys.stdin.readline
t = int(input())
for _ in range(t):
    prime = [0] * 41
    prime[1] = 1
    n = int(input())
    if n == 0:
        print(1, 0)
    else:
        for i in range(2, n+1):
            prime[i] = prime[i-1] + prime[i-2]
        print(prime[n-1], prime[n])
