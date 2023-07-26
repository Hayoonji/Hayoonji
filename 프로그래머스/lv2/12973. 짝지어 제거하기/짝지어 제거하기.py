def solution(s):
    answer = -1
    res=[]
    a=''
    #스택으로 풀기
    for i in range(len(s)):
        res.append(s[i])
        if (len(res)>1) and (res[-1]==res[-2]):
            res.pop(-1) #맨 마지막꺼 뺌
            res.pop(-1)
    if len(res)==0:
        return 1
    else:
        return 0
    