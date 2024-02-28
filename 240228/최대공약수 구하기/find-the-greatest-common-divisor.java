import java.util.Scanner;

public class Main {
    public static void print(int n, int m) {
        int num = 0;
        for (int i = 1; i <= (n > m ? n : m); i++) {
            if (n % i == 0 && m % i == 0) {
                num = i;
            }
        }
        System.out.print(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        print(n, m);
        sc.close();
    }
}