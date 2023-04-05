import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String str="*";
        String str2=" ";
        for(int i=1;i<=n;i++){
            String repeated=str.repeat(2*i-1);
            String repeated2=str2.repeat(n-i);
            System.out.println(repeated2+repeated);
        }
        for(int i=n-1;i>=1;i--){
            String repeated3=str.repeat(2*i-1);
            String repeated4=str2.repeat(n-i);
            System.out.println(repeated4+repeated3);

        }
        

        scanner.close();
    }    
}
