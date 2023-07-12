
def solution(citations):
    answer = 0
    for i in range(citations[-1]+1):
    #개수구하기
        cnt=0
        for j in range(len(citations)):
            
            if i<=citations[j]:
                cnt+=1
            
            if i==cnt:
                answer=i
    
        
    return answer