import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 2;
        int count = 1;
        while(true) {
            if (n == x) {
                break;
            }
            x *= 2;
            count++;
        }

        System.out.print(count);
        sc.close();
    }
}