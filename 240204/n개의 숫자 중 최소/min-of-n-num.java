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

            int n = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split(" ");
            int count = 1;
            int minNo = Integer.parseInt(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                if(minNo > Integer.parseInt(arr[i])) {
                    minNo = Integer.parseInt(arr[i]);
                }
                if (n == Integer.parseInt(arr[i])) {
                    count = i + 1;
                }
            }

            bw.write(minNo + " " + count);
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}