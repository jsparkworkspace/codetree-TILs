import java.util.Scanner;

public class Main {
    public static int compute(int a, int b) {
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0 || i % 10 == 5 || (i % 3 == 0 && i % 9 != 0)) {
              continue;
            } else {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(compute(a, b));

        sc.close();
    }
}