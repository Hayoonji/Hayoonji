def solution(s):
    
    result=[]
    
    
    real=s
    total_cnt=0
    zero_cnt=0
    l=0
    while True:
        #총 반복횟수
        total_cnt+=1
        answer = []
        #해당문자열에 모든 0 제거
        for i in real:
            if i=="1":
                answer.append(i)
            if i=="0":
                zero_cnt+=1 #0개수 누적

        #0제거 후 길이제기
        l=len(answer)
        #if l==1:
         #   break
       

        #이진변환하기
        first=bin(l)
        real=first[2:]
        if real=="1":
            break
    result.append(total_cnt)
    result.append(zero_cnt)
            
    
    return result