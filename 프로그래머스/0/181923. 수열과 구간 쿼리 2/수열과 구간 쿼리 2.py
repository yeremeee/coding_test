def solution(arr, queries):
    answer = []
    
    for query in queries:
        start = query[0]
        end = query[1]
        num = query[2]
        add = -1
        
        for i in range(start, end+1):
            if arr[i] > num:
                if add == -1 or arr[i] < add:
                    add = arr[i]
        
        answer.append(add)
        
    return answer