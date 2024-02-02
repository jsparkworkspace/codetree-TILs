import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");
        int[] arr = new int[10];
        arr[0] = Integer.parseInt(num[0]);
        arr[1] = Integer.parseInt(num[1]);

        for (int i = 0; i < arr.length; i++) {
            if (i < 2) {
                System.out.print(arr[i] + " ");
            } else {
                arr[i] = arr[i-1] + 2 * arr[i-2];
                System.out.print(arr[i] + " ");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}