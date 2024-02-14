import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String c = sc.next();

        if (str.indexOf(c) == -1) {
            System.out.print("No");
        } else {
            System.out.print(str.indexOf(c));
        }
        sc.close();
    }
}