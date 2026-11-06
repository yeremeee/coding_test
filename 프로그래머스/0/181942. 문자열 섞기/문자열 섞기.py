def solution(str1, str2):
    answer = ''
    l = len(str1)
    
    for i in range(0, l):
        answer += str1[i] + str2[i]
        
    return answer