import sys
input = sys.stdin.readline

def isPrime(x):
    if x == 1:
        return False
    else:
        for i in range(2, int(num**0.5)+1):
            if x % i == 0:
                return False
        return True

n, m = map(int, input().split())
for num in range(n, m+1):
    if isPrime(num):
        print(num)