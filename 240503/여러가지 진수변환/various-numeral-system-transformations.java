import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        int[] arr = new int[20];

        while (true) {
            if (n < b) {
                arr[cnt++] = n;
                break;
            }

            arr[cnt++] = n % b;
            n /= b;
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

        sc.close();
    }
}