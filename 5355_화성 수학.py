N = int(input())
for i in range(N):
    lst = list(input().split())
    lst[0] = float(lst[0])
    summ = 1
    for i in lst:
        if i == '@':
            summ *= 3
        elif i == '%':
            summ += 5
        elif i == '#':
            summ -= 7
        else:
            summ = i
    print(f'{summ:.2f}')