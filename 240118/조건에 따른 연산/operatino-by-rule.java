import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();

        while (true) {
            
            if (n >= 1000) {
            break;
            } else if (n % 2 == 0) {
                n = n * 3 + 1;
                count++;
            } else {
                n = n * 2 + 2;
                count++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}