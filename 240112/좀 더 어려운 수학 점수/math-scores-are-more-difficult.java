import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int matha = sc.nextInt();
        int enga = sc.nextInt();
        int mathb = sc.nextInt();
        int engb = sc.nextInt();

        if (matha == mathb) {
            if (enga > engb) {
                System.out.print("A");
            } else {
                System.out.print("B");
            }

        } else if (matha > mathb) {
            System.out.print("A");
        } else {
            System.out.print("B");
        }
        sc.close();
    }
}