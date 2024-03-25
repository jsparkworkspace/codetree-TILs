import java.util.Scanner;

public class Main {
    public static int compute(int n, int cnt) {
        if (n == 1) return cnt;

        if (n % 2 == 0) {
            n /= 2;
            cnt++;
        } else if (n % 2 == 1) {
            n = n * 3 + 1;
            cnt++;
        }

        return compute(n, cnt);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        System.out.print(compute(n, cnt));

        sc.close();
    }
}