import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] numCnt = new int[9];
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < num.length; j++) {
                if (Integer.parseInt(str[i]) == num[j]) {
                    numCnt[j]++;
                }
            }
        }

        for (int i = 0; i < numCnt.length; i++) {
            System.out.println(numCnt[i]);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}