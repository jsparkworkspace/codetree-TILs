import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];
        
        
        int totalcount = 0;
        int totalSum = 0;

        for (int i = 0; i < 2; i++) {
            int rowcount = 0;
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
                rowSum += arr[i][j];
                rowcount++;
                totalSum += arr[i][j];
                totalcount++;
            }
            System.out.printf("%.1f ", (float)rowSum / rowcount);
        }

        System.out.println();

        for (int i = 0; i < 4; i ++) {
            int colSum = 0;
            int colcount = 0;
            for (int j = 0; j < 2; j++) {
                colSum += arr[j][i];
                colcount++;
            }
            System.out.printf("%.1f ", (float)colSum / colcount);
        }

        System.out.println();
        System.out.printf("%.1f", (float)totalSum / totalcount);

        sc.close();
    }
}