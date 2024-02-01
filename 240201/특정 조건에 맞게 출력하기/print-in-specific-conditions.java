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

        String[] arr = br.readLine().split(" "); // String 값을 split으로 나누어 String 배열로 리턴

        for (int i = 0; i < arr.length - 1; i++) {
            if (Integer.parseInt(arr[i]) % 2 == 1) {
                bw.write(Integer.parseInt(arr[i]) + 3 + " ");
            } else {
                bw.write(Integer.parseInt(arr[i]) / 2 + " ");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}