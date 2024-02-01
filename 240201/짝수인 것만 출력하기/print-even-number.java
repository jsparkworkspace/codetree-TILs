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
        String[] arr = br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) % 2 == 0) {
                bw.write(arr[i] + " ");
            } 
        }
        bw.flush();

        br.close();
        bw.close();
    }
}