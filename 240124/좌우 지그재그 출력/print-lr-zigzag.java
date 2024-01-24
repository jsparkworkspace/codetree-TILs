import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                cnt = n * (i + 1) - (n - 1);
                for (int j = 0; j < n; j++) {
                    System.out.print(cnt + " ");
                    cnt++;
                }
            } else {
                cnt = n * (i + 1);
                for (int j = 0; j < n; j++) {
                    System.out.print(cnt + " ");
                    cnt--;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}