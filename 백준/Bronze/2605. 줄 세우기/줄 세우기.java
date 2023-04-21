import java.io.*;
import java.util.*;
public class Main {
    
    static int n,arr[],arr3[],size;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        n=scanner.nextInt(); //학생 수
        int arr[]=new int[n];

        //insert의 pos배열
        for(int i=0;i<n;i++){
            int a=scanner.nextInt();
            arr[i]=i-a;
        }
        int arr3[]=new int[n];
        //arr3 일단 초기화
        for(int i=0;i<n;i++){
            arr3[i]=-1;
        }
        //arraylist의 insert
        for(int i=0;i<n;i++){
            int pos=arr[i];
            if(arr3[pos]!=-1){
                for(int j=size;j>pos;j--){
                    arr3[j]=arr3[j-1];
                }
                arr3[pos]=i+1;
            }else{
                arr3[pos]=i+1;
            }
            size++;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr3[i]);
        }
        
    }
    
        
    
}