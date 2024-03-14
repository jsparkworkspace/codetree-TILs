import java.util.Scanner;

public class Main {
    public static int[] compute(int a, int b) {
        int[] arr = new int[2];
        if (a > b) {
            arr[0] = a * 2;
            arr[1] = b + 10;
        } else {
            arr[0] = a + 10;
            arr[1] = b * 2;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = compute(a, b);

        for (int n : arr) {
            System.out.printf("%d ", n);
        }

        sc.close();
    }
}