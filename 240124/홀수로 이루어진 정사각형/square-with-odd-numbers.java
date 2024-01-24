import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < 2 * n; i += 2) {

            for (int j = 0; j < 2 * n; j += 2) {
                System.out.print(11 + i + j + " ");
            }

            System.out.println();
        }
        sc.close();
    }
}