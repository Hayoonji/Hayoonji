def solution(n):
    answer = n**0.5
    if answer%1==0:
        return (answer+1)*(answer+1)
    else:
        return -1