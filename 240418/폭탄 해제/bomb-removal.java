import java.util.Scanner;

class Bome {

    String code;
    String color;
    int second;

    public Bome(String code, String color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String code = sc.next();
        String color = sc.next();
        int second = sc.nextInt();

        Bome bome = new Bome(code, color, second);

        System.out.printf("code : %s\n", bome.code);
        System.out.printf("color : %s\n", bome.color);
        System.out.printf("second : %d", bome.second);
        sc.close();
    }
}