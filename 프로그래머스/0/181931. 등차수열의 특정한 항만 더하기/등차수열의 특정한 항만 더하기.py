def solution(a, d, included):
    answer = 0
    
    for idx, bol in enumerate(included):
        if bol:
            answer += a + d * idx
    
    return answer