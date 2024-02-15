import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] arr = str.toCharArray();
        arr[1] = arr[str.length()-2] = 'a';

        str = String.valueOf(arr);
        System.out.print(str);

        sc.close();
    }
}