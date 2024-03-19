import java.util.Scanner;

public class Main {
    public static void printStr(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("HelloWorld");
        printStr(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printStr(sc.nextInt());
    }
}