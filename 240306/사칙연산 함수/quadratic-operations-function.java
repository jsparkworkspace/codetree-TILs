import java.util.Scanner;

public class Main {
    public static int sum(int x, int y) {
        return x + y;
    }

    public static int minus(int x, int y) {
        return x - y;
    }

    public static int mul(int x, int y) {
        return x * y;
    }

    public static int dev(int x, int y) {
        return x / y;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String op = sc.next();
        int y = sc.nextInt();

        switch(op) {
            case "+":
                System.out.printf("%d %s %d = %d", x, op, y, sum(x, y));
                break;
            case "-":
                System.out.printf("%d %s %d = %d", x, op, y, minus(x, y));
                break;
            case "*":
                System.out.printf("%d %s %d = %d", x, op, y, mul(x, y));
                break;
            case "/":
                System.out.printf("%d %s %d = %d", x, op, y, dev(x, y));
                break;
            default :
                System.out.print("False");
                       
        }

        sc.close();
    }
}