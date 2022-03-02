import sys

N = int(sys.stdin.readline())
'''
n을 2로 나눈다 -> 2는 소수
나눠 떨어지면 2를 리스트에 담음

n이 2로 안나눠떨어진다.
n을 3으로 나눈다. -> 3은 소수? 3을 2로 나누면 나눠떨어지지 않으므로 소수

'''
sos = N
i = 2
while sos > 1:
    while i <= N:
        if sos % i == 0:
            print(i)
            sos = sos / i
        else:
            i += 1
