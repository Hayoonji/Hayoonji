def solution(s):
    res=''
    l=[]
    answer=s.split(' ')
    for i in range(len(answer)):
        l.append(int(answer[i]))
    res=str(min(l))+" "+str(max(l))
    #print(min(l),max(l))
    return res
    