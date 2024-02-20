import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num = 0;
        int min = 100;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) continue;
                else if (arr[i] - arr[j] < 0) {
                    num = arr[j] - arr[i];
                } else {
                    num = arr[i] - arr[j];
                }
                if (min > num) {
                    min = num;
                } 
            }
        }

        System.out.print(min);

        sc.close();
    }
}