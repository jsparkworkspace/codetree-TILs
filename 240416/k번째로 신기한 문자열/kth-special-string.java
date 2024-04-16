import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String str = sc.next();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr);

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (cnt == k - 1) {
                System.out.println(arr[i]);
                break;
            }
            if (arr[i].indexOf(str) != -1) {
                cnt++;
            }
        }

        sc.close();
    }
}