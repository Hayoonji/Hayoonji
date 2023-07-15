def solution(A,B):
    answer = 0
    #젤 작은애랑 젤 큰애랑 곱하기
    A.sort()
    B.sort(reverse=True)
    for i in range(len(A)):
        a=A[i]
        b=B[i]
        answer+=(a*b)
        

    return answer