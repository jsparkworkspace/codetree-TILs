import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i == 0) {
                min = arr[i];
            }

            if (i != 0) {
                if (min > arr[i]) {
                    min = arr[i];
                    index = i;
                }
            }
        }

        int max = 0;

        if (index == arr.length - 1) {
            System.out.print(0);
        } else {
        for (int i = index; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } 
        }
        System.out.printf("%d", max - min);
        }

        sc.close();
    }
}