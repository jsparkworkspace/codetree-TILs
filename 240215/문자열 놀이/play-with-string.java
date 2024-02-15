import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int q = sc.nextInt();
        char[] arr;

        for (int i = 0; i < q; i++) {
            int qNum = sc.nextInt();
            arr = str.toCharArray();

            if (qNum == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr[a-1] = str.charAt(b-1);
                arr[b-1] = str.charAt(a-1);
                
            } else if (qNum == 2) {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == a) {
                        arr[j] = b;
                    }
                }
            }
            str = String.valueOf(arr);
            System.out.println(str);
        }

        sc.close();
    }
}