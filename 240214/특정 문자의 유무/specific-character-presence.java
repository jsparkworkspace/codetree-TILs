import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String b1 = "No";
        String b2 = "No";
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i+2).equals("ee")) {
                b1 = "Yes";
            } else if (str.substring(i, i+2).equals("ab")) {
                b2 = "Yes";
            } else {
                continue;
            }
        }

        System.out.print(b1 + " " + b2);
        sc.close();
    }
}