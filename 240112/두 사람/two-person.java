import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();
        String gender1 = sc.next();
        int age2 = sc.nextInt();
        String gender2 = sc.next();

        if ((age1 >= 19 || age2 >= 19) && (gender1.equals("M") || gender2.equals("M"))) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
        sc.close();
    }
}