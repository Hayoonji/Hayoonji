import heapq
from sys import maxsize
import sys

input = sys.stdin.readline

# 정점 개수와 간선 개수 입력
n = int(input())
m = int(input())

# 인접 리스트 초기화
graph = [[] for _ in range(n + 1)]
# 방문 여부 배열 및 초기 값 설정
visited = [maxsize] * (n + 1)

# 간선 정보 입력
for _ in range(m):
    a, b, c = map(int, input().split())
    graph[a].append((c, b))

# 시작 정점과 도착 정점 입력
start, end = map(int, input().split())

# 다익스트라 알고리즘 함수 정의
def dijkstra(x):
    pq = []  # 우선순위 큐 초기화
    heapq.heappush(pq, (0, x))  # 시작 정점을 큐에 넣음
    visited[x] = 0  # 시작 정점의 비용 초기화

    while pq:
        d, x = heapq.heappop(pq)  # 가장 작은 비용을 가진 정점 선택

        if visited[x] < d:
            continue  # 이미 처리된 노드인 경우 스킵

        for nw, nx in graph[x]:  # 현재 정점과 연결된 간선들을 탐색
            nd = d + nw  # 새로운 비용 계산

            if visited[nx] > nd:  # 새로운 비용이 더 작은 경우 업데이트
                heapq.heappush(pq, (nd, nx))  # 우선순위 큐에 새로운 비용과 정점 추가
                visited[nx] = nd  # 방문 배열 업데이트

# 다익스트라 알고리즘 실행
dijkstra(start)

# 결과 출력
print(visited[end])  # 도착 정점까지의 최단 거리 출력
