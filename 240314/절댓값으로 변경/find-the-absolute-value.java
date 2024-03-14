import java.util.Scanner;

public class Main {

    public static void compute(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] *= -1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        compute(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }

        sc.close();
    }
}