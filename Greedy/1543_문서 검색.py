import sys; input = sys.stdin.readline
document = input().rstrip()
search = input().rstrip()
cnt = 0
idx = 0
for i in range(len(document) - len(search)+1):
    if idx > i:
        continue
    if search == document[i: i+len(search)]:
        cnt += 1
        idx = i+len(search)
print(cnt)
