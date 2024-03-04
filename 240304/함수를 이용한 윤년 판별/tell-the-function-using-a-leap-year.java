import java.util.Scanner;

public class Main {
    public static boolean isNum(int y) {
        if (y % 100 == 0 && y % 400 != 0) {
            return false;
        } else if (y % 4 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        System.out.print(isNum(y));

        sc.close();
    }
}