import sys
K = int(sys.stdin.readline())
prime = [0]*(K+1)
prime[1] = 1
for i in range(2, K+1):
    prime[i] = prime[i-1] + prime[i-2]
ans = ((prime[K] + prime[K-1]) * 2) + ((prime[K-1] + prime[K-2]) * 2)
print(ans)
