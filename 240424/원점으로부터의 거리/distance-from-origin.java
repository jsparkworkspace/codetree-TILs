import java.util.Scanner;
import java.util.Arrays;

class Comma implements Comparable<Comma> {
    int i;
    int x;
    int y;

    public Comma(int i, int x, int y) {
        this.i = i;
        this.x = x < 0 ? x * -1 : x;
        this.y = y < 0 ? y * -1 : y;
    }

    @Override
    public int compareTo(Comma comma) {
        if (this.x + this.y != comma.x + comma.y) return (this.x + this.y) - (comma.x + comma.y);
        return this.i - comma.i;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Comma[] commas = new Comma[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            commas[i] = new Comma(i + 1, x, y);
        }
        
        Arrays.sort(commas);

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", commas[i].i);
        }

        sc.close();
    }
}