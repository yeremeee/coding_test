def solution(a, b):
    answer = 0
    maxNum = max(a, b)
    minNum = min(a, b)
    
    if a == b:
        return a
    
    for i in range(minNum, maxNum + 1):
        answer += i
        
    return answer