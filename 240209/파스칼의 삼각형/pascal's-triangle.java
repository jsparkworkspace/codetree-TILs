import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][0] = 1;
        }

        for (int i = 1; i < n; i++) {

            for (int j = 1; j <= i; j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }

        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[n-1][i]);
        }

        sc.close();
    }
}