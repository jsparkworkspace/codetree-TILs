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

        char[] arr = {'L', 'E', 'B', 'R', 'O', 'S'};

        char c = br.readLine().charAt(0);
        
        boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                b = true;
                bw.write(i + "");
            }
        }
        if (b == false) bw.write("None");

        bw.flush();
        bw.close();
        br.close();
    }
}