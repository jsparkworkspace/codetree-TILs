import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int avg = 1;
            for (int j = a; j <= b; j++) {
                avg *= j;
            }

            System.out.println(avg);
        }

        sc.close();
    }
}