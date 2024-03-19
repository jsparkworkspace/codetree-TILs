import java.util.Scanner;

public class Main {
    public static int sigma(int n) {
        if (n == 1) return n;

        return sigma(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print(sigma(n));

        sc.close();
    }
}