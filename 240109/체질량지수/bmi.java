import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int tall = sc.nextInt();
        int weight = sc.nextInt();
        int bmi = (weight * 100 * 100) / (tall * tall);

        System.out.println(bmi);
        if (bmi >= 25) {
            System.out.print("Obesity");
        }
    }
}