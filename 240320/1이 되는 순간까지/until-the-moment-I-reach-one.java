import java.util.Scanner;

public class Main {
    public static int cnt;
    public static int compute(int n) {
        if (n == 1) return 0;

        if (n % 2 == 0) {
            n /= 2;
            cnt++;
            compute(n);
        } else {
            n /= 3;
            cnt++;
            compute(n);
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(compute(n));

        sc.close();
    }
}