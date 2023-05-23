import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

// 별의 위치 저장
class Star {
	double x;
	double y;

	Star(double x, double y) {
		this.x = x;
		this.y = y;
	}
}

// 인접한 별과 간선의 비용(거리) 저장
class StarDist implements Comparable<StarDist> {
	int star;
	double dist;

	StarDist(int star, double dist) {
		this.star = star;
		this.dist = dist;
	}

	@Override //우선순위 큐를 이용하기 위해
	public int compareTo(StarDist d) {
		return (int) (this.dist - d.dist);
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//별(노드) 개수
		Star[] stars = new Star[n]; // 별의 위치
        boolean[] visited = new boolean[n]; // 방문 여부
		double[] distance = new double[n]; // 시작 정점에서부터 각 정점 사이의 거리
        // 별과 간선의 정보를 담는 그래프
		ArrayList<ArrayList<StarDist>> graph = new ArrayList<>(); 
		
		for (int i = 0; i < n; i++) {
			distance[i] = Double.MAX_VALUE; // 거리 초기화            
			graph.add(new ArrayList<>()); // 그래프 구현
		}

		// 입력
		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			stars[i] = new Star(x, y);
			for (int j = 0; j < i; j++) {
                //거리계산
				double dist = Math.sqrt(Math.pow(stars[i].x - stars[j].x, 2) + Math.pow(stars[i].y - stars[j].y, 2));
				graph.get(i).add(new StarDist(j, dist));
				graph.get(j).add(new StarDist(i, dist));
                
			}
		}

		// prim; 최소 거리 찾기
		double result = 0;
        distance[0] = 0;

        while (true) {
            int minDistStar = -1;  // 최소 거리를 가진 별의 인덱스를 저장하는 변수
            double minDist = Double.MAX_VALUE;  // 최소 거리를 저장하는 변수

            // 최소 거리를 가진 방문하지 않은 별을 찾는 과정
            for (int i = 0; i < n; i++) {
                if (!visited[i] && distance[i] < minDist) {
                    minDist = distance[i];
                    minDistStar = i;
                }
            }

            // 방문하지 않은 별 중 최소 거리를 가진 별이 없으면 반복문 종료
            if (minDistStar == -1)
                break;

            visited[minDistStar] = true;  // 해당 별을 방문했다고 표시
            result += minDist;  // 최소 거리를 결과에 더함

            // 인접한 별들의 거리를 갱신하는 과정 (더 짧은 거리가 발견되면 갱신)
            ArrayList<StarDist> adjacentStars = graph.get(minDistStar);
			for (int j = 0; j < adjacentStars.size(); j++) {
				StarDist starDist = adjacentStars.get(j);
				int starIndex = starDist.star;
				double dist = starDist.dist;
				if (!visited[starIndex] && dist < distance[starIndex]) {
					distance[starIndex] = dist;
				}
			}

        }


		// 소수점 둘째 자리까지 출력
		System.out.printf("%.2f", result);
	}

	
}
