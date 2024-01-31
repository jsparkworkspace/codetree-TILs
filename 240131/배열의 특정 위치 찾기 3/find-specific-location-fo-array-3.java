import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        boolean b = true;
        for (int i = 0; i < arr.length; i++) {
            try {
            arr[i] = sc.nextInt();

            if (arr[i] == 0 && b == true) {
                System.out.print(arr[i-3] + arr[i-2] + arr[i-1]);
                b = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }

        sc.close();
    }
}