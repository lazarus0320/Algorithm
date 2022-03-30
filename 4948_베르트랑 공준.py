import sys; input = sys.stdin.readline
def isPrime(num):
        for i in range(2, int(num**0.5) + 1):
            if num % i == 0:
                return False
        return True

while True:
    n = int(input())
    cnt = 0

    if n == 0:
        break
    if n == 1:
        print(1)
    elif n > 1:
        for i in range(n+1, (2*n)):
            if isPrime(i):
                cnt += 1
        print(cnt)
