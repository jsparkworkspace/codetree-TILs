import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String n = Integer.toString(sc.nextInt());
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += (n.charAt(i) - '0');
        }

        System.out.print(sum);

        sc.close();
    }
}