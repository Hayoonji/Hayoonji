
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

public class Main {
    static class Node implements Comparable<Node> {
        int row, col,loopy;

        public Node(int row, int col, int loopy) {
            this.row=row;
            this.col=col;
            this.loopy = loopy;
        }

        @Override
        public int compareTo(Node o) {
            return this.loopy - o.loopy;
        }
    }

    static int[] dR={1,-1,0,0}; //우좌상하
    static int[] dC = {0, 0, 1, -1};//이게뭐지
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int cnt=0;

        //전체 코드
        while(true){
            int N=Integer.parseInt(br.readLine());
            cnt++;
            if(N==0){ //0넣으면 끝
                break;
            }
            int[][]cave=new int[N][N];
            int[][]theifLoopy=new int[N][N];//최소비용

            //cave와 thiefLoopy 초기화
            for(int i=0;i<N;i++){//행
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=0;j<N;j++){ //열
                    cave[i][j]=Integer.parseInt(st.nextToken());
                    theifLoopy[i][j]=-1;
                }
            }
            //다익스트라
            //1. pq 초기화, 시작점노드 넣기
            PriorityQueue<Node> pq = new PriorityQueue<Node>();
            pq.add(new Node(0,0,cave[0][0]));
            theifLoopy[0][0]=cave[0][0]; //시작점 지정
            while(!pq.isEmpty()){
                //pq에 첫번째 값 반환하고 제거
                Node now=pq.poll();
                //도착지 도착하면 break
                if(now.row==N-1 && now.col==N-1){
                    sb.append("Problem ").append(cnt).append(": ").append(now.loopy).append("\n");
                    break;
                }
                //현재 위치에서 우좌상하 확인
                for(int i=0;i<4;i++){
                    int dr = now.row + dR[i];
                    int dc = now.col + dC[i];

                    //맵을 벗어나는 경우 건너뛰기
                    if(dr<0||dc<0||dr>=N||dc>=N)
                        continue;
                    //새로 발견한 경로 가중치가 기존 경로보다 클때
                    if(theifLoopy[dr][dc] >= now.loopy + cave[dr][dc])
                        continue;
                    //새로 발견한 경로 가중치가 기존 경로보다 작을때 갱신
                    theifLoopy[dr][dc] = now.loopy + cave[dr][dc];
                    pq.add(new Node(dr, dc, theifLoopy[dr][dc]));
                }

            }
        }
        System.out.print(sb);

    }
}