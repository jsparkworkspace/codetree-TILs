import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");
        int[] result = new int[10];
        result[0] = Integer.parseInt(num[0]);
        result[1] = Integer.parseInt(num[1]);

        for (int i = 0; i < result.length; i++) {
            if (i >= 2) result[i] = result[i-2] + result[i-1];
            //System.out.print(result[i] % 10 + " ");
            bw.write(result[i] % 10 + " ");
        }

        br.close();
        bw.close();
    }
}