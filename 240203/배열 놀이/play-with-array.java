import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int qnum = sc.nextInt();

            if (qnum == 1) {
                System.out.println(num[sc.nextInt() - 1]);
            } else if (qnum == 2) {
                int nnum = sc.nextInt();
                boolean b = false;
                for (int j = 0; j < num.length; j++) {
                    if (nnum == num[j]) {
                        b = true;
                        System.out.println(j + 1);
                        break;
                    } 
                }
                if (b == false) {
                    System.out.println(0);
                }
                
            } else if (qnum == 3) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                for (int j = a - 1; j <= b - 1; j++) {
                    System.out.print(num[j] + " ");
                }
                System.out.println();

            } 
        } 


        sc.close();
    }
}