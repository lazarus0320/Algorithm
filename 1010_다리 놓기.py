import sys
def factorial(num):
    val = 1
    for i in range(1, num+1):
        val *= i
    return val
    
T = int(sys.stdin.readline())
for _ in range(T):
    N, M = map(int, sys.stdin.readline().split())

    print(factorial(M) // (factorial(M-N) * factorial(N)))