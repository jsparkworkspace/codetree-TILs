import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int maxNo = 0;
        int minNo = 0;
        for (;;) {
            int n = sc.nextInt();
            if (n == 999 || n == -999) {
                break;
            }

            if (n > maxNo) {
                maxNo = n;
            }

            if (n < minNo) {
                minNo = n;
            }

        }

        System.out.printf("%d %d", maxNo, minNo);
        
        sc.close();
    }
}