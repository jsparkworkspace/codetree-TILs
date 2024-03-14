import java.util.Scanner;

public class Main {

    public static String str;

    public static int index(String subStr) {
        return str.indexOf(subStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        str = sc.next();
        String subStr = sc.next();

        System.out.print(index(subStr));


        sc.close();
    }
}