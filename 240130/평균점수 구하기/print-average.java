import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double[] d= new double[8];
        double sum = 0;
        for (int i = 0; i < d.length; i++) {
            d[i] = sc.nextDouble();
            sum += d[i];
        }
        System.out.printf("%.1f", sum / d.length);
        sc.close();
    }
}