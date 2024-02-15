import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String str = sc.next();
        int cnt = 0;

        for (int i = 0; i < text.length() - 1; i++) {
            if (text.substring(i, i + 2).equals(str)) {
                cnt++;
            }
        }

        System.out.print(cnt);
        sc.close();
    }
}