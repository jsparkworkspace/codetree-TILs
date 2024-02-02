import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] count = new int[10];
        String[] arr = br.readLine().split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) == 0) break;
            for (int j = 0; j < count.length; j++) {
                if (Integer.parseInt(arr[i]) / 10 == j + 1) {
                    count[j]++;
                }
            }
        }

        for (int i = 10; i > 0; i--) {
            bw.write(i * 10 + " - " + count[i-1] +"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}