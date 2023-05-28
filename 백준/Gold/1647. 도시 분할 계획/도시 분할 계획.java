import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class node implements Comparable<node>{
    int s,e,v;
    public node(int s,int e,int v){
        super();
        this.s=s;//노드1
        this.e=e;//노드2
        this.v=v;//가중치
    }
    //(Collection sort와 함께쓰임) 간선의 크기로 오름차순하기 위한 compareTo() 메서드
    @Override
    public int compareTo(node o){
        return this.v - o.v;
    }
}
public class Main {
    static int E,V,sum,max;
    static int[] parent; //부모배열
    // 1) MST 초기화
    static List<node> list=new ArrayList();
    public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		V = Integer.parseInt(st.nextToken()); //정점 개수
        E = Integer.parseInt(st.nextToken()); //간선 개수
        // 0. 부모 배열 만들기
        parent = new int[V + 1];
		for (int i = 1; i <=V; i++) {
			parent[i] = i;
		}
        // 0. 입력받기
        for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken()); //노드1
			int e = Integer.parseInt(st.nextToken()); //노드2
			int v = Integer.parseInt(st.nextToken()); //가중치
			list.add(new node(s,e,v));
		}
        //크루스칼 과정
        //1) 그래프 간선들을 가중치의 오름차순으로 정렬해놓은 뒤
        //2) (사이클 탐색) 사이클을 형성하지 않는 선에서
        //3) 정렬된 순서대로 간선선택 후 노드들 연결
        //cf) 사이클 형성 여부 확인법: 각 노드의 부모가 동일하면 그 노드들끼리 union 하면 안됨

        // 2) edge 가중치의 크기로 오름차순 정렬(compareTo메서드로 인해 가중치비교 바로 가능)
        Collections.sort(list);
        max=0;
        int size=list.size();
        // 정렬된 순서대로 간선 탐색
        for(int i=0;i<size;i++){
            node n=list.get(i);
            
            //3) (사이클 탐색) 만약 두 노드의 부모가 다르다면(부모가 같으면 두 노드 연결X)
            if(!isSameParent(n.s,n.e)){
                // sum에 간선 크기 저장
                sum+=n.v;
                
                // 4) 노드1(s)와 노드2(e) 연결
                union(n.s,n.e);
                
                max=n.v;
                
            }
        }
        System.out.println(sum-max);
    }
    //============union find(크루스칼 기본)==============
	// 간선 연결
    private static void union(int a, int b) {
		a = find(a);
		b = find(b);

		if (a != b) {
			parent[b]=a;
        }
	}
    // 부모 노드 찾기
	private static int find(int a) {
        //1) 부모가 내 자신이면
		if (parent[a] == a) {
			return a; //그대로
		}
        //2) 부모가 다른애면 path compression 
		return parent[a] = find(parent[a]); //다른 노드로 합침
	}

	// 부모가 같은지를 판별해주는 method
	private static boolean isSameParent(int a, int b) {
		a = find(a);
		b = find(b);

		if (a == b)
			return true;
		else
			return false;
	}

}
