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
        int[] arr = new int[30];
        arr[0] = 1;
        arr[1] = n;
        for (int i = 0; i < arr.length; i++) {
            if (i < 2) 
                bw.write(arr[i] + " ");
            else {
                arr[i] = arr[i-2] + arr[i-1];
                bw.write(arr[i] + " ");
                if (arr[i] >= 100) {
                    break;
                }
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}