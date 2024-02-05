import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] e = new int[1000];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            e[arr[i]-1]++;
           
        }

        int max = -1;

        for (int i = e.length - 1; i >= 0; i--) {
            if (e[i] == 1) {
                max = i + 1;
                break;
            }
            
        }

        System.out.print(max);

        

        sc.close();
    }
}