import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    static int L;
    static long sum;
    static String a;
    static String b[];
    public static void main(String[] args) {
        HashMap<String,Integer>codes=new HashMap<String,Integer>();
		codes.put("a",1);
        codes.put("b",2);
        codes.put("c",3);
        codes.put("d",4);
        codes.put("e",5);
        codes.put("f",6);
        codes.put("g",7);
        codes.put("h",8);
        codes.put("i",9);
        codes.put("j",10);
        codes.put("k",11);
        codes.put("l",12);
        codes.put("m",13);
        codes.put("n",14);
        codes.put("o",15);
        codes.put("p",16);
        codes.put("q",17);
        codes.put("r",18);
        codes.put("s",19);
        codes.put("t",20);
        codes.put("u",21);
        codes.put("v",22);
        codes.put("w",23);
        codes.put("x",24);
        codes.put("y",25);
        codes.put("z",26);
        //System.out.println(codes); 

        Scanner scan = new Scanner(System.in);
		L = scan.nextInt(); //문자열 길이
        a=scan.next();
        b=a.split("");
        for(int i=0;i<a.length();i++){
            sum+=(codes.get(b[i])*(Math.pow(31,i)))%1234567891;
        }
        System.out.println(sum);
        
    }
}
