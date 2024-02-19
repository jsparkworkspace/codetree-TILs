import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(str);
        
        for (int i = 0; i < str.length(); i++) {
            str = str.substring(str.length() - 1) + str.substring(0,str.length() - 1);
            System.out.println(str);
        }
        sc.close();
    }
}