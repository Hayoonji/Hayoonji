import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main{
    static int N,M,res,parents[];
    
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        parents=new int[N];
        for(int i=0;i<parents.length;i++){
            parents[i]=i; //parent가 없는거로 초기화화
        }
        for(int i=0; i<M; i++){
            StringTokenizer st2=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st2.nextToken());
            int b=Integer.parseInt(st2.nextToken());
            //사이클이 형성되는지 확인(false가 될때까지)
            if(!union(a,b)){
                res=i+1;
                break;
            }
        }
        System.out.println(res);
    }
    private static boolean union(int a, int b){
        int aRoot=find(a,parents);
        int bRoot=find(b,parents);
        // 1. a와 b의 루트노드가 같다면 사이클 형성 -> break
        if(aRoot==bRoot){
            return false;
        }
        // 2. a,b루트가 같지 않다면
        parents[bRoot]=aRoot;
        return true;

    }
    private static int find(int u,int[] parent){
        // 1-1. 자기자신이 루트일때, 그대로 리턴
        if(parents[u]==u){
            return u;
        }

        // 1-2. 자기자신이 루트 아니라면, 그 부모 index로 계속 타고 올라감
        parents[u] = find(parents[u],parents);
        return parents[u];
    }
}