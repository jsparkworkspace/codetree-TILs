import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        if (c == 'a') {
            c = 'z';
        } else {
            c -= 1; 
        }

        System.out.printf("%c", c);

        sc.close();
    }
}