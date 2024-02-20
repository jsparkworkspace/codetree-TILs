import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[200];
        int cnt = 0;

        while (true) {
            String str = sc.next();
            if (str.equals("0")) {
                System.out.println(cnt);
                break;
            } else {
                arr[cnt++] = str;
            }
        }

        for (int i = 0; i < arr.length; i+=2) {
            if (arr[i] == null) {
                break;
            } else {
            System.out.println(arr[i]);
            }
        }


        sc.close();
    }
}