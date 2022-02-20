M = int(input())
N = list(map(int, input().split()))

prime = []

for n in N:
    if n != 1:
        for i in range(2, n):
            if n % i == 0:
                break
        else:
            prime.append(n)

print(len(prime))