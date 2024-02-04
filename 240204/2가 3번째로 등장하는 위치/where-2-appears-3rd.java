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

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (Integer.parseInt(arr[i]) == 2) {
                count++;
            }
            if (count == 3) {
                bw.write(i+1 + "");
                break;
            }
        }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}