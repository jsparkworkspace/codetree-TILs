import java.util.Scanner;

public class Main {
    public static String compute(int n) {
        String str = "";
        if (n % 2 == 0 && (n / 10 + n % 10) % 5 == 0) {
            str = "Yes";
        } else {
           str = "No";
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(compute(n));
        sc.close();
    }
}