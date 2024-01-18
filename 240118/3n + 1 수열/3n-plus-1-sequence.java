import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while(true) {
            if (n == 1) break;
            if (n % 2 == 0) {
                n /= 2;
                count++;
            } else {
                n = n * 3 + 1;
                count++;
            }
        
        }
        System.out.print(count);
        sc.close();
    }
}