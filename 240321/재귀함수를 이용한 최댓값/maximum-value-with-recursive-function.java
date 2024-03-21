import java.util.Scanner;

public class Main {

    public static int[] arr;

    public static int maxNum(int n) {
        if (n == 0) return arr[n]; 
        int tmp = maxNum(n - 1);
        return arr[n] > tmp ? arr[n] : tmp; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(maxNum(n - 1));

        sc.close();
    }
}