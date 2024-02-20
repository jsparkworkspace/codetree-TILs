import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        int len = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
                len++;
            } else {
                break;
            }
        }
        int num1 = Integer.parseInt(str1.substring(0,len));

        len = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str1.charAt(i) >= '0' && str2.charAt(i) <= '9') {
                len++;
            } else {
                break;
            }
        }
        int num2 = Integer.parseInt(str2.substring(0,len));

        System.out.print(num1 + num2);
        
        sc.close();
    }
}