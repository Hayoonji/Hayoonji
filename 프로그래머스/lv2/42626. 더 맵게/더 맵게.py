from heapq import heapify,heappush, heappop
def solution(scoville, K):
    idx=0
    scoville.sort()
    while scoville[0]<K: #조건문이 참인동안 돈다
        if len(scoville) <= 1:
                return -1
        else:
            idx+=1
            a=heappop(scoville)
            b=heappop(scoville)
            c = a+(b*2)

            heappush(scoville,a+(b*2))
            
        
    return idx