import sys; input = sys.stdin.readline
n = int(input())
nums = list(map(int, input().split()))

new_nums = sorted(list(set(nums)))
dic = {new_nums[i] : i for i in range(len(new_nums))}
print(dic)
for i in nums:
    print(dic[i], end=' ')
