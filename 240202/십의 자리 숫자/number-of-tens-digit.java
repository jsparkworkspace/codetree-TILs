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

        //int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] numCnt = new int[9];
        String[] arr = br.readLine().split(" ");

        for (int i = 0; i < arr.length - 1; i++) {
            
            for (int j = 0; j < numCnt.length; j++) {
                
               if (Integer.parseInt(arr[i]) / 10 == j + 1) {
                    numCnt[j]++;
                }
            }
        }

        for (int i = 0; i < numCnt.length; i++) {
            bw.write(i + 1 + " - " + numCnt[i] + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}