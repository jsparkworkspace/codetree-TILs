import java.util.Scanner;

public class Main {
    public static int compute(int n) {
        if (n == 1) return n;
        if (n == 2) return n;

        if (n % 2 == 0) {
            return compute(n - 2) + n;
        }

        return compute(n - 2) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print(compute(n));

        sc.close();
    }
}