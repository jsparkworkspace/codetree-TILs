import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
    String c = sc.next();
    int n = sc.nextInt();
    char s = c.charAt(0);
    if (s == 'A') {
      for (int i = 1; i <= n; i++) {
        System.out.print(i + " ");
      }
    }
    if (s == 'D') {
      for (int i = n; i > 0; i--) {
        System.out.print(i + " ");
      }
    }

    sc.close();

  }
}