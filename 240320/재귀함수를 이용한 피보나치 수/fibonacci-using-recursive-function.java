import java.util.Scanner;

public class Main {
    public static int compute(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;

        return compute(n - 1) + compute(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(compute(n));

        sc.close();
    }
}