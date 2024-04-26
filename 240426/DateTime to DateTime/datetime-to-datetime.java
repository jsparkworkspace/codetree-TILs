import java.util.Scanner;

public class Main {

    public static int numOftime(int d, int h, int s) {
        return (d - 11) * 24 * 60 + (h - 11) * 60 + (s - 11);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = numOftime(a, b, c);
        if (result < 0) {
            System.out.print(-1);
        } else {
            System.out.print(result);
        }

        sc.close();
    }
}