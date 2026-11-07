def solution(s):
    answer = ''
    l = len(s)
    i = l // 2
    
    if l % 2 == 1:
        answer = s[i]
    else:
        answer = s[i - 1 : i + 1]
        
    return answer