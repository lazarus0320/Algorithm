import sys
n = int(sys.stdin.readline())
prime = [0] * 10001
prime[1] = 1
for i in range(2, n+1):
    prime[i] = prime[i-1] + prime[i-2]
print(prime[n])
