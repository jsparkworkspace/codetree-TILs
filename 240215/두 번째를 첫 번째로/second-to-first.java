import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char tmp = str.charAt(1);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == tmp) {
                str = str.substring(0,i) + str.charAt(0) + str.substring(i+1);
            }
        }
        System.out.print(str);
        sc.close();
    }
}