import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();
            if (str.equals("END")) {
                break;
            } else {
                String str2 = "";
                for (int i = 0; i < str.length(); i++) {
                    str2 += str.substring(str.length() - 1 - i, str.length() - i);
                }
                System.out.println(str2);
            }
        }


        sc.close();
    }
}