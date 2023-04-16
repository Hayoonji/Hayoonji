import java.util.Scanner;
public class Main {
    public static int[] arr;
    public static int top=-1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N=scanner.nextInt();
        arr=new int[N];
        for(int i=0; i<N; i++){
            int a= scanner.nextInt();
            if(a!=0){
                //push
                top++;
                arr[top]=a;
            }else{
                //pop
                arr[top]=0;
                top--;
            }
        }
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        System.out.println(total);
        
        
    }
    
}