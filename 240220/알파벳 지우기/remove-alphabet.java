import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        String tmp = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9') {
                tmp += str1.charAt(i);
            }
        }
        int num1 = Integer.parseInt(tmp);
        
        tmp = "";
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) >= '0' && str2.charAt(i) <= '9') {
                tmp += str2.charAt(i);
            }
        }
        int num2 = Integer.parseInt(tmp);
    
        System.out.print(num1 + num2);

        sc.close();
    }
}