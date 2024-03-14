import java.util.Scanner;

class Compute {
        int a;
        int b;
        public Compute(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
public class Main {

    public static void compute(Compute comp) {
        if (comp.a > comp.b) {
            comp.a += 25;
            comp.b *= 2;
        } else {
            comp.b += 25;
            comp.a *= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Compute comp = new Compute(sc.nextInt(), sc.nextInt());
 
        compute(comp);

        System.out.printf("%d %d", comp.a, comp.b);



        sc.close();
    }
}