import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int sum2 = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 1) sum += arr[i];
            if (i % 3 == 2) {
                sum2 += arr[i];  
                count++;
            }
        }
        System.out.printf("%d %.1f", sum, (double)sum2 / count);
        sc.close();
    }
}