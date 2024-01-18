import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        for (;;) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();

        System.out.println(a * b);
            if (c.equals("C")) {
                break;
            }  

        }
        sc.close();
    }
}