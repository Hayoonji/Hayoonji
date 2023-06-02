
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int idx=0;
    static int idx2=0;
    static int[] parent;
    static int[] count;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		int L = scan.nextInt();
        String maxBook = "";
        int max = 0;
        HashMap<String,Integer>codes=new HashMap<String,Integer>();
        count = new int[L * 2];
        
        for(int i=0;i<L;i++){
            String a=scan.next();
            //System.out.println(idx);
            //count[idx]=++idx2;
            //처음 나오는 거면 1로
            if(!codes.containsKey(a)){
                codes.put(a,1);
            }else{//그렇지 않으면 숫자 하나씩 증가
                codes.put(a,codes.get(a)+1);
            }
            
        }
        
        for(String key : codes.keySet()){
            
            int value=codes.get(key);
            if(max==value && maxBook.compareTo(key)>0){
                maxBook=key;
                max=value;
            }else if(max<value){
                maxBook=key;
                max=value;
            }
        }
        System.out.println(maxBook); 
               
    }
}
