import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddsum = 0;
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (k % 3 == 0) {
                oddsum += k;
            }
        }
        System.out.print(oddsum);
        sc.close();
    }
}