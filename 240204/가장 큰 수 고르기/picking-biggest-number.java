import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String[] arr = br.readLine().split(" ");
            int tmp = Integer.parseInt(arr[0]);

            for (int i = 1; i < arr.length; i++) {
                if (tmp < Integer.parseInt(arr[i])) {
                    tmp = Integer.parseInt(arr[i]);
                }
            }

            bw.write(tmp +"");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}