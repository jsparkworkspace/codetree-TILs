import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int a = 0;
        int b = 1000;
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            if (num < 500) {
                if (num > a) {
                    a = num;
                }
            } else {
                if (num < b) {
                    b = num;
                }
            }
        }
        System.out.printf("%d %d", a, b);
        sc.close();
    }
}