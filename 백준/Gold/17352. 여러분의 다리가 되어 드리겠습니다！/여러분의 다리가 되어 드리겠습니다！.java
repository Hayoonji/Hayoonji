import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    static int N,res,parents[];
    
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());

        N=Integer.parseInt(st.nextToken());

        parents=new int[N+1];
        for(int i=0;i<parents.length;i++){
            parents[i]=i; //자기 자신으로 초기화화
        }

        for(int i=0; i<N-2; i++){
            StringTokenizer st2=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st2.nextToken());
            int b=Integer.parseInt(st2.nextToken());
            //1. 루트 하나로 합치기
            union(a,b);
        }
        //==============확인용===============
        //for(int i=1;i<parents.length;i++){
          //  System.out.println(parents[i]);
       // }
        //값 같은지 확인, 다르면 출력 후 break
        for(int i=2;i<parents.length;i++){
            
            if(find(1,parents)!=find(i,parents)){
                System.out.println(1+" "+i);
                return ;
            }
        }


    }
    private static void union(int a, int b){
        int aRoot=find(a,parents);
        int bRoot=find(b,parents);
        //  a,b루트가 같지 않다면 하나로 합치기기
        if(aRoot!=bRoot){
            parents[bRoot]=aRoot;
        }
        
        
    }
    public static int find(int u, int parent[]){
        //1. 자기자신이 루트라면, 자기자신 리턴
        if(parents[u]==u){
            return u;
        }
        //2. 자기자신이 루트 아니라면, 부모 index까지 올라감
        //parents[u]=find(parents[u],parents);
        return parents[u]=find(parents[u],parents);
    }
        
}
