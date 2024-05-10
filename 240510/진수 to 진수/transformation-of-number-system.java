import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();
        int[] arr = new int[n.length()];

        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = n.charAt(i) - '0';
            num = num * a + arr[i];
        }

        int[] result = new int[20];
        int index = 0;
        while (true) {
            if (num < b) {
                result[index++] = num;
                break;
            }

            result[index++] = num % b;
            num /= b;

        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(result[i]);
        }

        sc.close();
    }
}