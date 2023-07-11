def solution(n):
    answer = []
    n=str(n)
    for i in n[::-1]:
        answer.append(i)
    answer=list(map(int,answer))
    return answer