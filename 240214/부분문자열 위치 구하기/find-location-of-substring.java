import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String str = sc.next();

        System.out.print(word.indexOf(str));

        sc.close();
    }
}