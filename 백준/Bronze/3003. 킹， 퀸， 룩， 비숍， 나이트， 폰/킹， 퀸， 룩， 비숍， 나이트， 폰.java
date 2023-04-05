import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int Arrayint[]=new int[6];
        int answer[]={1,1,2,2,2,8};

        for(int i=0;i<6;i++){
            Arrayint[i]=scanner.nextInt();}

        for(int j=0;j<6;j++){
            
            System.out.print(answer[j]-Arrayint[j]+" ");
        }

        scanner.close();
    }    
}