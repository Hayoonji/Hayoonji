def solution(arr):
    answer = []
    #min(arr)
    arr.remove(min(arr))
    if len(arr)==0:
        arr.append(-1)
    return arr