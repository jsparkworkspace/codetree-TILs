import java.util.Scanner;

public class Main {
    public static int n;

    public static void incrementNum(int i) {
        if (i > n) return;

        System.out.printf("%d ", i);
        incrementNum(++i);
    }

    public static void decrementNum(int i) {
        if (i < 1) return;

        System.out.printf("%d ", i);
        decrementNum(--i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        incrementNum(1);
        System.out.println();
        decrementNum(n);

        sc.close();
    }
}