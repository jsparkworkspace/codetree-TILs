import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
           tmp = tmp < arr[i] + arr[arr.length - (1 + i)] ? arr[i] + arr[arr.length - (1 + i)] : tmp;
        }

        System.out.println(tmp);
        

        sc.close();
    }
}