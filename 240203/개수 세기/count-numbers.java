import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){

        String[] arr = br.readLine().split(" ");
        String[] num = br.readLine().split(" ");
        int cnt = 0;
        for (int i = 0; i < num.length; i++) {
            if (Integer.parseInt(arr[1]) == Integer.parseInt(num[i])) {
                cnt++;
            }
        }

        bw.write(cnt + "");
        bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }     
    }
}