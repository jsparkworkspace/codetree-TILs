import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        int cnt = 0;

        while (!str1.equals(str2)) {
            str1 = str1.substring(str1.length() - 1) + str1.substring(0, str1.length() - 1);
            cnt++;
            if (cnt > str1.length()) {
                cnt = -1;
                break;
            }
        }
        
        System.out.print(cnt);

        sc.close();
    }
}