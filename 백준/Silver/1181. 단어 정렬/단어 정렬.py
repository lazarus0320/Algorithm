N = int(input())
words = []
for _ in range(N):
    words.append(input())

set_words = set(words)

tuple_words = []
for word in set_words:
    tuple_words.append((len(word), word))

tuple_words.sort()

for l, word in tuple_words:
    print(word)