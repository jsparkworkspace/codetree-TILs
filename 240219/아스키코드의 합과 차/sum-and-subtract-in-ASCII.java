import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        int sum = c1 + c2;
        int minus = 0;
        if (c1 > c2) {
            minus = c1 -  c2;
        } else {
            minus = c2 - c1;
        }
        

        System.out.printf("%d %d", sum, minus);

        sc.close();
    }
}