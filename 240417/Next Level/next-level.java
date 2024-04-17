import java.util.Scanner;

class Account {
    String id;
    int level;

    public Account() {
        this.id = "codetree";
        this.level = 10;
    }

    public Account(String id, int level) {
        this.id = id;
        this.level = level;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = sc.next();
        int level = sc.nextInt();

        Account account1 = new Account();
        System.out.printf("user %s lv %d\n", account1.id, account1.level);

        Account account2 = new Account(id, level);
        System.out.printf("user %s lv %d", account2.id, account2.level);

        sc.close();
    }
}