import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String cmd = sc.next();

        for (int i = 0; i < cmd.length(); i++) {
            if (cmd.charAt(i) == 'L') {
                str = str.substring(1) + str.substring(0, 1);
            } else {
                str = str.substring(str.length() - 1) + str.substring(0, str.length() - 1);
            }
        }
        System.out.println(str);

        sc.close();
    }
}