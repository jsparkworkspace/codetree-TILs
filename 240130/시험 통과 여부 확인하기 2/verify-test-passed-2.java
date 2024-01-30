import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int[] arr = new int[4];
            int sum = 0;
            double avg = 0;
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            avg = (double)sum / 4;
            if (avg >= 60) {
                System.out.println("pass");
                count++;
            } else {
                System.out.println("fail");
            }

        }
        System.out.print(count);
        sc.close();
    }
}