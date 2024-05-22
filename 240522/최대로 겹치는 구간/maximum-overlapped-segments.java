import java.util.Scanner;

public class Main {

    static final int[] arr = new int[201];

    public static int offset(int num) {
        num = num < 0 ? num + 100 : num;
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x1 = offset(sc.nextInt());
            int x2 = offset(sc.nextInt());

            for (int j = x1; j < x2; j++) {
                arr[j]++;
            }
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = max < arr[i] ? arr[i] : max;
        }

        System.out.println(max);

        sc.close();
    }
}