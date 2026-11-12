def solution(arr, queries):

    for querie in queries:
        temp = arr[querie[1]]
        arr[querie[1]] = arr[querie[0]]
        arr[querie[0]] = temp
        
    return arr