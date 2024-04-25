import java.util.Scanner;
import java.util.Arrays;

class Sequence implements Comparable<Sequence>{
    int num;
    int index;

    public Sequence(int num, int index) {
        this.num = num;
        this.index = index;
    }

    @Override
    public int compareTo(Sequence sequence) {
        return this.num - sequence.num;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Sequence[] sequences = new Sequence[n];
        Sequence[] origin = new Sequence[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sequences[i] = new Sequence(num, i);
            origin[i] = new Sequence(num, i);
        }

    Arrays.sort(sequences);

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (origin[i].index == sequences[j].index) {
                System.out.printf("%d ", j + 1);
                break;
            }
        }
    }

        sc.close();
    }
}