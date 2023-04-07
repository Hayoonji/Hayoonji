import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean checked = true;

        for (int i = 0 ; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() -1 -i )) {
                checked = false;
                break;
            }
        }
        if (checked == true) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}