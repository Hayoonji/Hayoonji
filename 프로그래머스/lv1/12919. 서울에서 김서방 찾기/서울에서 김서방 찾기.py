def solution(seoul):
    answer = ''
    for i in range(len(seoul)):
        if seoul[i]=="Kim":
            i=str(i)
            answer="김서방은 "+i+"에 있다"
    return answer