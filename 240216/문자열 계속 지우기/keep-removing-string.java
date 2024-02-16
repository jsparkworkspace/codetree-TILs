import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String strA = sc.next();
        String strB = sc.next();

        for (;;) {

            int n = strA.indexOf(strB);
            if (n == -1) {
                break;
            }
            else if (n == 0) {
                strA = strA.substring(strB.length());
            } else { 
                strA = strA.substring(0, n) + strA.substring(n + strB.length());
            }
        }

        System.out.print(strA);

        sc.close();
    }
}