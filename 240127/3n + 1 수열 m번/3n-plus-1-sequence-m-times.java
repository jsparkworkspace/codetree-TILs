import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {

        int n = sc.nextInt();
        int cnt = 0;
        while (true) {
            if (n == 0) {
                break;
            }
            else if (n % 2 == 0) {
                n /= 2;
                cnt++;
            } else {
                n = n * 3 + 1;
                cnt++;
            }

            if (n == 1) {
                break;
            }
        }
            System.out.println(cnt);
        }

        


    }
}