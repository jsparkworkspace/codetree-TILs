import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class Main {
    public static Integer[] sort(Integer[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static Integer[] rsort(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr);

        for (int i : arr) {
            System.out.printf("%d ", i);
        }

        System.out.println();

        rsort(arr);
        for (int i : arr) {
            System.out.printf("%d ", i);
        }

        sc.close();
    }
}