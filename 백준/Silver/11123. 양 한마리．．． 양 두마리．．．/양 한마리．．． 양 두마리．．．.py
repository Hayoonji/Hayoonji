def dfs(x, y):
    stack = [(x, y)]
    count = 0

    while stack:
        x, y = stack.pop()
        
        if x < 0 or x >= n or y < 0 or y >= m:
            continue
        
        if graph[x][y] == "#":
            count += 1
            graph[x][y] = '0'
            
            stack.append((x-1, y))
            stack.append((x+1, y))
            stack.append((x, y-1))
            stack.append((x, y+1))
    
    return count

t = int(input()) # 전체 횟수
for _ in range(t):
    n, m = map(int, input().split())
    graph = []
    for _ in range(n):
        graph.append(list(input()))

    result = []

    for i in range(n):
        for j in range(m):
            if graph[i][j] == "#":
                result.append(dfs(i, j))

    print(len(result))
