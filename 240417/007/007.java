import java.util.Scanner;

class Secret {
    String code;
    char point;
    int time;

    public Secret(String code, char point, int time) {
        this.code = code;
        this.point = point;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Secret secret = new Secret(sc.next(), sc.next().charAt(0), sc.nextInt());

        System.out.printf("secret code : %s\n", secret.code);
        System.out.printf("meeting point : %c\n", secret.point);
        System.out.printf("time : %d", secret.time);

    }
}