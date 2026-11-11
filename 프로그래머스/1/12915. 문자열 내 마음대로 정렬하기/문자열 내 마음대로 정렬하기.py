def solution(strings, n):
    answer = []
    arr = []

    for s in strings:
        arr.append((s[n], s))

    arr.sort()

    for key, value in arr:
        answer.append(value)

    return answer