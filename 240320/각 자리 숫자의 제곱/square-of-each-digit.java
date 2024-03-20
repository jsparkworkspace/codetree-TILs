import java.util.Scanner;

public class Main {
    public static int compute(int n) {
        if (n < 10) return n * n;

        return compute(n / 10) + (n % 10) * (n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print(compute(n));

        sc.close();
    }
}