import java.util.Scanner;

public class Main {

    public static int[] arr = new int[201];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int index = 100;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            String str = sc.next();

            if (str.equals("L")) {
                x *= -1;
                for (int j = index; j > index + x; j--) {
                    arr[j]++;
                    //System.out.printf("%d : %d\n", j, arr[j]);
                }
                index += x;
            } else {
                for (int j = index; j < index + x; j++) {
                    arr[j]++;
                    //System.out.printf("%d : %d\n", j, arr[j]);
                }
                index += x;
            }
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) cnt++;
        }

        System.out.print(cnt);

        sc.close();
    }
}