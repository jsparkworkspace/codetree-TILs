import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        float sum = 0.0f;
        float avg = 0.0f;
        int count = 0;
        for (;;) {
            int age = sc.nextInt();

            if (age >= 30) {
                break;
            } else {
            sum += age;
            count++;
            }
        }
        avg = sum / count;
        System.out.printf("%.2f", avg);
        sc.close();
    }
}