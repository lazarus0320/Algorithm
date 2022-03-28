import sys
K = int(sys.stdin.readline())
prime = [0]*(K+1)
prime[1] = 1
for i in range(2, K+1):
    prime[i] = prime[i-1] + prime[i-2]
print(prime[K-1], prime[K])
