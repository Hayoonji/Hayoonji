def solution(sizes):
    answer = 0
    #가로<세로 -> 두개 위치 바꿈
    for i in range(len(sizes)):
        if sizes[i][0]<sizes[i][1]:
            tmp=sizes[i][1]
            sizes[i][1] = sizes[i][0]
            sizes[i][0]=tmp
    #가로의 최댓값 구하기
    max=sizes[0][0]
    for i in range(len(sizes)):
        if sizes[i][0]>max:
            max=sizes[i][0]
    #세로의 최댓값 구하기
    max2=sizes[0][1]
    for i in range(len(sizes)):
        if sizes[i][1]>max2:
            max2=sizes[i][1]
    return max*max2