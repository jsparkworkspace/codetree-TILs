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

        String[] str = br.readLine().split(" ");

        int[] arr = new int[10];
        int sum = 0;
        while (Integer.parseInt(str[0]) > 1) {
            arr[Integer.parseInt(str[0]) % Integer.parseInt(str[1])]++;
            str[0] = Integer.parseInt(str[0]) / Integer.parseInt(str[1]) + "";
        }

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i] * arr[i];
        }
        System.out.print(sum);

        bw.flush();
        bw.close();
        br.close();
    }
}