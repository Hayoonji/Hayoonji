def solution(t, p):
    answer = 0
    #부분 문자열 구하기
    l=len(p)
    res=[]
    cnt=0
    for i in range(len(t)):
        res.append(t[i:i+l])
        
    for i in range(len(res)):
        if len(res[i])==l:
            if int(res[i])<=int(p):
                cnt+=1
            
    return cnt