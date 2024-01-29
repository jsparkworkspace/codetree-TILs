import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int cnt = 0;
        boolean b = true;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (b == false) continue;

            if (arr[i] >= 250) {
                b = false;
            } else {
                sum += arr[i];
                cnt++;
            }
        }
        System.out.printf("%d %.1f", sum, (float)sum / cnt);
        sc.close();
    }
}