def solution(num_list):
    answer = 0
    mul = 1
    sumSquare = 0
    
    for n in num_list:
        mul *= n
        sumSquare += n
    
    sumSquare = sumSquare ** 2
    
    if mul < sumSquare:
        answer = 1
        
    return answer