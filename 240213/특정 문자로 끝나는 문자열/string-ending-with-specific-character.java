import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        char c = sc.next().charAt(0);
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(arr[i].length() - 1) == c) {
                System.out.println(arr[i]);
                b = true;
            }
        }

        if (b == false) {
            System.out.print("None");
        }


        sc.close();
    }
}