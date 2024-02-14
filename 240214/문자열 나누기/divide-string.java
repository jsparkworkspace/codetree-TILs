import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += sc.next();
        }
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            cnt++;
            if (cnt % 5 == 0 && i != 0) {
                System.out.println(str.charAt(i));
            } else {
                System.out.print(str.charAt(i));
            }
        }

        sc.close();
    }
}