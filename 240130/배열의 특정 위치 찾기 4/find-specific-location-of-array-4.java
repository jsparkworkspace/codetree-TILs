import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                break;
            } else if (arr[i] % 2 == 0) {
                sum += arr[i];
                count++;
            }
        }
        System.out.printf("%d %d", count, sum);
        sc.close();
    }

}