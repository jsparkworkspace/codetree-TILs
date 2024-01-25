import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            for (int j = b; j > 0; j -= a) {
                if (j <= 2) {
                    System.out.printf("%d * %d = %d", j, i, j * i);
                } else {
                    System.out.printf("%d * %d = %d / ", j, i, j * i);
                }
            }

            System.out.println();
        }
        sc.close();
    }
}