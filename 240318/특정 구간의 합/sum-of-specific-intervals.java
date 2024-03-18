import java.util.Scanner;

public class Main {

    public static int[] arr;

    public static void compute(int a1, int a2) {
        int sum = 0;

        for (int i = a1 - 1; i <= a2 - 1; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];
        int a1 = 0;
        int a2 = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            a1 = sc.nextInt();
            a2 = sc.nextInt();
            compute(a1, a2);
        }

        sc.close();
    }
}