import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = n * (i + 1);
            bw.write(arr[i] + " ");
            if (arr[i] % 5 == 0) {
                count++;
            }
            if (count == 2) break;
        }

        bw.flush();
        br.close();
        bw.close();
    }
}