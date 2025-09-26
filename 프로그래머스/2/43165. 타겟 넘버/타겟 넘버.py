

def solution(numbers, target):
    
    def dfs(index, cur_sum):
        if index == len(numbers):
            return True if cur_sum == target else False

        return (
            dfs(index + 1, cur_sum + numbers[index])
            + dfs(index +1, cur_sum - numbers[index]))
    
    
    return dfs(0, 0)