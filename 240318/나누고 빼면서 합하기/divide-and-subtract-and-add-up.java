import java.util.Scanner;

public class Main {
    public static int[] arr;
    public static int sum;

    public static void compute(int m) {
        sum += arr[m - 1];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        while (true) {
            if (m == 1) {
                compute(m);
                break;
            }

            compute(m);
            if (m % 2 == 1) {
                m -= 1;
            } else {
                m /= 2;
            }
        }

        System.out.print(sum);

        sc.close();
    }
}