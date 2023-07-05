def solution(clothes):
    answer = 1
    closet={}
    #딕셔너리 만들기
    for element in clothes:
        key=element[1]
        val=element[0]
        
        if key in closet:
            closet[key].append(val)
        else:
            closet[key]=[val]
    #최종 결과
    for key in closet:
        answer*=len(closet[key])+1
    
    return answer-1