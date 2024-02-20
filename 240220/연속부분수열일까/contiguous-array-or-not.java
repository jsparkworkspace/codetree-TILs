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

            String[] num = br.readLine().split(" ");
            String[] a = br.readLine().split(" ");
            String[] b = br.readLine().split(" ");
            String str = "";
            for (int i = 0; i < b.length; i++) {
                str += b[i];
            }

            boolean stat = false;
            // 수열 A의 길이 - 수열 B의 길이 + 1 만큼 반복
            for (int i = 0; i <= a.length - b.length; i++) {
                
                String tmp = "";
                // 수열 B의 길이만큼 수열 A의 값을 붙인다.
                for (int j = i; j < i + b.length; j++) {
                    tmp += a[j];
                }

                if (str.equals(tmp)) {
                    stat = true;
                    break;
                }
            }

            if (stat == true) {
                System.out.print("Yes");
            } else {
                System.out.print("No");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}