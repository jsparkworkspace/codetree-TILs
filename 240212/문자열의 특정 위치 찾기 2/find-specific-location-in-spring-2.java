import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String[] str = {"apple", "banana", "grape", "blueberry", "orange"};
        char c = sc.next().charAt(0);
        int cnt = 0;
        for (int i = 0; i < str.length; i++) {
            boolean b = false;
            for (int j = 0; j < str[i].length(); j++) {
                if ((j == 2 || j == 3) && str[i].charAt(j) == c) {
                    b = true;
                    continue;
                }
            }
            if (b == true) {
                System.out.println(str[i]);
                cnt++;
            }
        }

        System.out.print(cnt);
        sc.close();
    }
}