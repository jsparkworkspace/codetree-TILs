import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        for (i = 1; i <=100; i++) {
                sum += i;
            if (sum >= n) {
                break;
            } 
            
        }
        System.out.print(i);
        sc.close();
    }
}