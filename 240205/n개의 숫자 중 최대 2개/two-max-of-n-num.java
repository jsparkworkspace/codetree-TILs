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
            
            for (int i = 0; i < arr.length; i++) {

                for (int j = i; j < arr.length; j++) {
                    if (Integer.parseInt(arr[i]) < Integer.parseInt(arr[j])) {
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

            }
            bw.write(arr[0] + " " + arr[1]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}