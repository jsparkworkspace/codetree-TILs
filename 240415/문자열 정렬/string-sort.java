import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        String sortStr = new String(arr);

        System.out.println(sortStr);
        sc.close();
    }
}