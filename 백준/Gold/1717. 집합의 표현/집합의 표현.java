import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    // 1. FIND함수
    public static int find(int u,int[] parent){
        // 1-1. 자기자신이 루트일때, 그대로 리턴
        if(parent[u]==-1){
            return u;
        }

        // 1-2. 자기자신이 루트 아니라면, 그 부모 index로 계속 타고 올라감
        int k=u;
        while(parent[u]!=-1){
            u=parent[u];//부모가 -1이 될때까지 계속 한칸씩 이동 (u가 루트)
        }
        int p;
        // 1-3. k의 부모를 모두 u로 바꿔줌
        while(parent[k]!=u){
            p=parent[k];
            parent[k]=u;
            k=p;
        }
        return u; //최종 루트 리턴
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        //parent저장위한 배열
        int[] parent=new int[n+1]; //0부터 시작하니까
        for(int i=0;i<parent.length;i++){
            parent[i]=-1; //parent가 없는거로 초기화화
        }
        for(int i=0; i<m; i++){
            StringTokenizer st2=new StringTokenizer(br.readLine());
            int c=Integer.parseInt(st2.nextToken());
            int u=Integer.parseInt(st2.nextToken());
            int v=Integer.parseInt(st2.nextToken());

            

            if(c==0){
                // 2. UNION 함수
                // 2-1. 각각의 루트 찾아서
                int ur=find(u,parent);
                int vr=find(v,parent);
                //원래는 weighted union rule 적용해야되는데 그냥 합쳐도됨
                //path comprassion도 안함

                // 2-2. 하나로 합쳐줌
                if(ur!=vr){
                    //무한루프 방지위해서 if문 넣어야됨
                    parent[vr]=ur;//vr의 parent를 ur로 함
                }
                
            }else{
                // 3. DIFFER 함수(같은 루트인지 확인)
                // 3-1. 같은 숫자면(걍 자기 자신이면)
                if(u==v){
                System.out.println("YES"); //당연히 같은집합에 있음
                continue;
                }
                // 3-2. u와 v가 다른숫자면 각각의 루트 같은지 확인
                //differ(find,find,root같은지 확인,print)
                int ur=find(u,parent);
                int vr=find(v,parent);

                // 3-3. 루트 같으면 yes, 다르면 no
                if(ur==vr){
                    System.out.println("YES"); //같으면 같은곳에 있다고함
                }else{
                    System.out.println("NO");
                }
                
            
            }
            
        }
        
        br.close();
    }
}
