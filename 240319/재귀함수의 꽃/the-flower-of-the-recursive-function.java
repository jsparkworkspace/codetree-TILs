import java.util.Scanner;

public class Main {

    public static boolean state = false;
    public static int i;

    public static void printNum(int n) {

        if (n > i) return;

        if (n < 1) {
            state = true;
            n++;
        }

        if (state == false) {
            System.out.printf("%d ", n);
            printNum(n - 1);
        } else {
            System.out.printf("%d ", n);
            printNum(n + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        i = n;

        printNum(n);

        sc.close();
    }
}