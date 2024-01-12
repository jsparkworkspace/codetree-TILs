import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int math1 = sc.nextInt();
        int eng1 = sc.nextInt();
        int math2 = sc.nextInt();
        int eng2 = sc.nextInt();

        if (math1 > math2 && eng1 > eng2) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
        sc.close();
    }
}