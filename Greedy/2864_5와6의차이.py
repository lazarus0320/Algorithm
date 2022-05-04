A, B = input().split()
max_cnt , min_cnt = 0, 0
for i in range(len(A)):
    take = 10 ** (len(A)-(i+1))
    if A[i] == '5':
        max_cnt += take
    elif A[i] == '6':
        min_cnt += take
    if B[i] == '5':
        max_cnt += take
    elif B[i] == '6':
        min_cnt += take

sum = int(A) + int(B)
min = sum - min_cnt
max = sum + max_cnt
print(min, max)
