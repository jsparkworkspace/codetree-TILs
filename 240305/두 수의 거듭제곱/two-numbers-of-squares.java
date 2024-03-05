import java.util.Scanner;

public class Main {
    public static int op(int a, int b) {
        int num = 1;
        for (int i = 0; i < b; i++) {
            num *= a;
        }
        return num;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(op(a, b));

        sc.close();
    }
}