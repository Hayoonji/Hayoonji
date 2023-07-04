import math

def solution(progresses, speeds):
    prog = []
    for i in progresses:
        prog.append(100 - i)
    
    # 기능별 배포가능일
    stack = []
    for i in range(len(speeds)):
        stack.append(math.ceil(prog[i] / speeds[i]))
    
    answer = []

    cnt=0
    for i in range(1,len(stack)):
        if max(stack[0:i]) < stack[i]:
            cnt = cnt + 1
            answer.append(cnt)
            cnt=0
            i = i+1
        else :
            cnt = cnt + 1
            i = i+1

    answer.append(len(stack)-sum(answer))
            
        
    return answer