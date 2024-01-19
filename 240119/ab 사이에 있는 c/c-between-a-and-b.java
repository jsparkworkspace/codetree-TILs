import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean type = false;
        for (int i = a; i <= b; i++) {
            if (i % c == 0) {
                type = true;
                
                break;
            } 
        }
        if (type == true) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
        sc.close();
    }
}