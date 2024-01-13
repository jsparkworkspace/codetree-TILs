import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int temp = sc.nextInt();
        String str1 = sc.next();
        int temp1 = sc.nextInt();
        String str2 = sc.next();
        int temp2 = sc.nextInt();
        int count = 0;

        if (str.equals("Y") && temp >= 37) {
            count++;
        }

        if (str1.equals("Y") && temp1 >= 37) {
            count++;
        }

        if (str2.equals("Y") && temp2 >= 37) {
            count++;
        }

        if (count >= 2) {
            System.out.print('E');
        } else {
            System.out.print("N");
        }

        sc.close();
    }
}