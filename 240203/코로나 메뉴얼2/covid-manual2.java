import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] count = new int[4];

        for (int i = 0; i < 3; i++) {
            String[] arr = br.readLine().split(" ");
            
            if (arr[0].equals("Y")) {
                if (Integer.parseInt(arr[1]) >= 37) {
                    count[0]++;
                } else {
                    count[2]++;
                }
            } else if (arr[0].equals("N")) {
                if (Integer.parseInt(arr[1]) >= 37) {
                    count[1]++;
                } else {
                    count[3]++;
                }
            } 
        }

        for (int i = 0; i < count.length; i++) {
            bw.write(count[i] + " ");
        }
        if (count[0] >= 2) {
            bw.write("E");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}