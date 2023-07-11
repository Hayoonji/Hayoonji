def solution(n):
    answer = 0
    n=str(n)
    result=[]
    for i in n:
        result.append(i)
    result.sort(reverse=True)
    result="".join(map(str,result))
    return int(result)
    