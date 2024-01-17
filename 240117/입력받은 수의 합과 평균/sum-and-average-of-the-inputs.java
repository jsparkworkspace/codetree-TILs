import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        float avg = 0.0f;
        int i = 0;
        for (i = 0; i < n; i++) {
            int a = sc.nextInt();
            sum += a;
        }
        avg = (float) sum / i;
        System.out.printf("%d %.1f", sum, avg);
        sc.close();
    }
}