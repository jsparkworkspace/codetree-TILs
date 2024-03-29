import java.util.Scanner;

public class Main {

    public static int prime(int a, int b) {
        int sum = 0;
        boolean isPrime = true;
        for (int i = a; i <= b; i++) {
            isPrime = true;
            if (i == 1) {
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            sum = isPrime == true ? sum += i : sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(prime(a, b));

        sc.close();
    }
}