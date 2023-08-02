# 깊이 우선 탐색(DFS) 함수 정의
def dfs(x, y):
    # 지도 범위를 벗어나면 False 반환
    if x < 0 or x >= n or y < 0 or y >= n:
        return False

    # 현재 위치가 집(1)인 경우
    if graph[x][y] == 1:
        # 단지의 집 개수(count) 증가
        global count
        count += 1
        # 해당 위치를 방문했음을 표시하기 위해 0으로 변경
        graph[x][y] = 0

        # 상하좌우 위치에 대해 재귀적으로 DFS 호출
        dfs(x-1, y) # 상
        dfs(x+1, y) # 하
        dfs(x, y-1) # 좌
        dfs(x, y+1) # 우
        return True
    return False

# 지도의 크기를 입력받음
n = int(input())

# 지도 정보를 2차원 리스트로 입력받음
graph = []
for _ in range(n):
    graph.append(list(map(int, input())))

# 단지 크기를 저장할 리스트
result = []

# 모든 위치에 대해 DFS 수행하여 단지를 찾고, 단지의 크기를 result에 저장
for i in range(n):
    for j in range(n):
        count = 0
        if dfs(i, j):
            result.append(count)

# 단지의 수 출력
print(len(result))
# 각 단지의 집 개수를 오름차순으로 출력
result.sort()
for cnt in result:
    print(cnt)
