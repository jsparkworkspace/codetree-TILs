import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        String[] binary = n.split("");

        int num = 0;
        for (int i = 0; i < binary.length; i++) {
            num = num * 2 + Integer.parseInt(binary[i]);
        }

        System.out.println(num);

        sc.close();
    }
}