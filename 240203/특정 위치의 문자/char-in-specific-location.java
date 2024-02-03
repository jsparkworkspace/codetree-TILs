import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] arr = {'L', 'E', 'B', 'R', 'O', 'S'};
        boolean b = false;
        char c = sc.next().charAt(0);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                b = true;
                System.out.print(i);
            }
        }
        if (b == false) System.out.print("None");

        sc.close();
    }
}