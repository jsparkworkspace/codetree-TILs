import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        boolean b = true;

        for (int i = 0; i < n; i++) {
            if (arrA[i] == arrB[i]) {
                continue;
            } else {
                System.out.println("No");
                b = false;
                break;
            }
        }

        if (b == true) {
            System.out.println("Yes");
        }

        sc.close();
    }
}