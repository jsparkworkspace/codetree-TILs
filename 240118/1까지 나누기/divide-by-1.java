import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int count = 0;
        while(true) {
            n /= num;
            num++;
            count++;
            if (n <= 1) {
                break;
            }
        }

        System.out.print(count);
        sc.close();
    }
}