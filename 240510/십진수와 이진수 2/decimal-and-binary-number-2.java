import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        int[] arr = new int[n.length()];
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = n.charAt(i) - '0';
            //System.out.print(arr[i] + " ");
            num = num * 2 + arr[i];
        }

        num *= 17;

        int[] binary = new int[20];
        int index = 0;
        while (true) {
            if (num < 2) {
                binary[index++] = num;
                break;
            }

            binary[index++] = num % 2;
            num /= 2;
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }

        sc.close();
    }
}