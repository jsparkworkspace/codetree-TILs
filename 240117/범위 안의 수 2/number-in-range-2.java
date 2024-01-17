import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        float avg = 0.0f;
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num >= 0 && num <= 200) {
                sum += num;
                count++;
            }
        }
        avg = (float) sum / count;
        System.out.printf("%d %.1f", sum, avg);
        sc.close();
    }
}