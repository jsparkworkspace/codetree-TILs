import java.util.Scanner;

public class Main {
    public static String allEquals(String a) {
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i - 1) != a.charAt(i)) {
                return "Yes";
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        System.out.print(allEquals(a));

        sc.close();
    }
}