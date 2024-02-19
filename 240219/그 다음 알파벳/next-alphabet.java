import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        System.out.printf("%c", (char) ((int)sc.next().charAt(0) + 1));

        sc.close();
    }
}