import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int qNum = sc.nextInt();

            if (qNum == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                char tmp = str.charAt(a - 1);
                str = str.substring(0, a - 1) + str.charAt(b - 1) + str.substring(a);
                str = str.substring(0, b - 1) + tmp + str.substring(b);
                
            } else if (qNum == 2) {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == a) {
                        str = str.substring(0, j) + b + str.substring(j + 1);
                    }
                }
            }
            System.out.println(str);
        }

        sc.close();
    }
}