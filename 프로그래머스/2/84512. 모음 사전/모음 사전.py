def solution(word):
    answer = 0
    dict = []
    vowels = ['A', 'E', 'I', 'O', 'U']
    
    def dfs(cur_word):
        dict.append(cur_word)
        
        if len(cur_word) == 5:
            return
        
        for v in vowels:
            dfs(cur_word + v)
    
    dfs("")
    
    return dict.index(word)