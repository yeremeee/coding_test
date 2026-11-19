def solution(intStrs, k, s, l):
    answer = []
    
    for num in intStrs:
        temp = int(num[s:s+l])
        
        if temp > k:
            answer.append(temp)
            
    return answer