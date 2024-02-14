import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String str = a + b;
        String str2 = b + a;
        boolean t = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str2.charAt(i)) {
                continue;
            } else {
                t = false;
                break;
            }
        }

        System.out.print(t);

        sc.close();
    }
}